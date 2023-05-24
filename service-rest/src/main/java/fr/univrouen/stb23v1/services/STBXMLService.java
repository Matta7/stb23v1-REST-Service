package fr.univrouen.stb23v1.services;

import fr.univrouen.stb23v1.repository.STB;
import fr.univrouen.stb23v1.util.ResourceReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.StringReader;


@Service
public class STBXMLService {

    public String getList() {
        return "";
    }

    public String getById(String id) {
        return "";
    }

    public String deserializeXml() {
        try {
            Resource resource = new DefaultResourceLoader().getResource("classpath:/xml/stb23.tp1.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(STB.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            STB stb = (STB) unmarshaller.unmarshal(resource.getFile()/*new StringReader(xmlContent)*/);
            return stb.toString();
        } catch (JAXBException e) {
            return e.getMessage();
            // Gérer l'exception selon vos besoins
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private String readFileToString(String filePath) throws IOException {
        Path path = Paths.get(filePath);
        byte[] bytes = Files.readAllBytes(path);
        return new String(bytes, StandardCharsets.UTF_8);
    }
}
