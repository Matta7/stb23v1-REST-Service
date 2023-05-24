package fr.univrouen.stb23v1.services;

import fr.univrouen.stb23v1.repository.STB;
import fr.univrouen.stb23v1.util.ResourceReader;

import jakarta.xml.bind.Marshaller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;


@Service
public class STBXMLService {

    public String getList() {
        return "";
    }

    public String getById(String id) {
        return "";
    }


}
