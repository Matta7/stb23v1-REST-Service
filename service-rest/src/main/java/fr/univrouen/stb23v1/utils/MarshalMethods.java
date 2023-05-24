package fr.univrouen.stb23v1.utils;

import fr.univrouen.stb23v1.entities.STB;
import fr.univrouen.stb23v1.entities.STBs;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class MarshalMethods {

    private static File xmlSchemaFile;

    static {
        try {
            xmlSchemaFile = new DefaultResourceLoader().getResource("classpath:/xml/schema/stb").getFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static STB deserializeXml(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(STB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = sf.newSchema(xmlSchemaFile);
            unmarshaller.setSchema(schema);

            STB stb = (STB) unmarshaller.unmarshal(file);
            return stb;

        } catch (JAXBException e) {
            return null;
        } catch (SAXException e) {
            throw new RuntimeException(e);
        }
    }

    public static String serializeXml(STB stb) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( STB.class );
            Marshaller marshaller = jaxbContext.createMarshaller();
            //marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
            //marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            marshaller.marshal(stb, sw);

            return sw.toString();

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }

    public static String serializeSTBs(STBs stbs) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( STBs.class );
            Marshaller marshaller = jaxbContext.createMarshaller();
            //marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
            //marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            StringWriter sw = new StringWriter();

            marshaller.marshal(stbs, sw);

            return sw.toString();

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
