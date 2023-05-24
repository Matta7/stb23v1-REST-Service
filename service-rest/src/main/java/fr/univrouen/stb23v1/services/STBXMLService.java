package fr.univrouen.stb23v1.services;

import org.springframework.stereotype.Service;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

@Service
public class STBXMLService {

    public String getList() {
        return "";
    }

    public String getById(String id) {
        return "";
    }

    public String deserializeXml(String xmlContent) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(STB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return ((STB) unmarshaller.unmarshal(new StringReader(xmlContent))).toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            // Gérer l'exception selon vos besoins
        }
        return "AAAAAAAAAAAAAAAAAAAAAAAAAAAA";
    }
}
