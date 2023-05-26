package fr.univrouen.stb23v1.model.utils;

import fr.univrouen.stb23v1.model.entities.ResultSTBList;
import fr.univrouen.stb23v1.model.entities.STB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.core.io.DefaultResourceLoader;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.*;

public class MarshalMethods {

    public static STB deserializeXml(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(STB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();


            StringReader reader = new StringReader(xml);
            STB stb = (STB) unmarshaller.unmarshal(reader);
            return stb;

        } catch (JAXBException e) {
            return null;
        }
    }

    public static ResultSTBList deserializeXmlList(String xml) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(ResultSTBList.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();


            StringReader reader = new StringReader(xml);
            ResultSTBList resultSTBList = (ResultSTBList) unmarshaller.unmarshal(reader);
            return resultSTBList;

        } catch (JAXBException e) {
            return null;
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
}
