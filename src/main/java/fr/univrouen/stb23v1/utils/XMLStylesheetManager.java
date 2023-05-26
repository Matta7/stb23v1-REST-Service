package fr.univrouen.stb23v1.utils;

import fr.univrouen.stb23v1.entities.STB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.util.JAXBSource;
import org.apache.tomcat.jni.Library;
import org.springframework.core.io.DefaultResourceLoader;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class XMLStylesheetManager {

    public static String getStbHtml(STB stb) throws TransformerException, JAXBException, IOException {
        TransformerFactory tf = TransformerFactory.newInstance();

        File xsltFile = new DefaultResourceLoader().getResource("classpath:/xml/stylesheet/stb23.tp3.xslt").getFile();
        StreamSource xslt = new StreamSource(xsltFile);
        Transformer transformer = tf.newTransformer(xslt);

        // Source
        JAXBContext jc = JAXBContext.newInstance(STB.class);
        JAXBSource source = new JAXBSource(jc, stb);

        // Result
        StringWriter sw = new StringWriter();
        StreamResult result = new StreamResult(sw);


        // Transform
        transformer.transform(source, result);

        String res = sw.toString();

        // On récupère la première ligne du résultat pour la supprimer
        // <title> dans la balise head pour le nom de la STB

        res = res.replaceFirst("<html xmlns:stb=\"http://univrouen.fr/stb23\">", "<!DOCTYPE html>\n<html lang=\"fr\">");
        res = res.replaceFirst("<head>", "<head>\n\t\t<title>" + stb.getTitle() + "</title>");

        return res;
    }

    public static String getStbResumeHtml(String xml) throws TransformerException, JAXBException, IOException {

        // TransformerFactory pour créer un objet Transformer
        TransformerFactory transformerFactory = TransformerFactory.newInstance();


        File xsltFile = new DefaultResourceLoader().getResource("classpath:/xml/stylesheet/resume/stbResume.xslt").getFile();

        StreamSource xsltSource = new StreamSource(xsltFile);
        Transformer transformer = transformerFactory.newTransformer(xsltSource);

        // Flux XML en tant que chaîne de caractères
        StreamSource xmlSource = new StreamSource(new StringReader(xml));

        // Flux de sortie pour stocker le résultat HTML
        StringWriter outputWriter = new StringWriter();
        StreamResult outputResult = new StreamResult(outputWriter);

        // Transformation du XML en HTML
        transformer.transform(xmlSource, outputResult);

        // Récupération du résultat HTML en tant que chaîne de caractères
        String htmlString = outputWriter.toString();

        return htmlString;
    }
}
