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

public class MarshalMethods {
    
    public static STB deserializeXml() {
        try {
            Resource resource = new DefaultResourceLoader().getResource("classpath:/xml/stb23.tp1.xsd.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(STB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            STB stb = (STB) unmarshaller.unmarshal(resource.getFile());
            Resource resource2 = new DefaultResourceLoader().getResource("classpath:/xml/test0.xml");
            serializeXml(stb, resource2.getFile());

            return stb;
        } catch (JAXBException e) {
            return null;
            // Gérer l'exception selon vos besoins
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void serializeXml(STB stb, File file) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( STB.class );
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
            marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

            marshaller.marshal(stb, System.out);


            marshaller.marshal(stb, file);

        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}
