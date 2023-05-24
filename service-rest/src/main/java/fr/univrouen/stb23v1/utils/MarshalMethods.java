package fr.univrouen.stb23v1.utils;

import fr.univrouen.stb23v1.entities.STB;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class MarshalMethods {
    
    public static STB deserializeXml(File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(STB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            STB stb = (STB) unmarshaller.unmarshal(file);
            return stb;

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
