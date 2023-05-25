package fr.univrouen.stb23v1.services;

import fr.univrouen.stb23v1.utils.StatusGenerator;
import fr.univrouen.stb23v1.utils.XMLStylesheetManager;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
public class STBHTMLService {

    @Autowired
    private STBXMLService stbxmlService;

    public String getList() throws JAXBException, IOException, TransformerException {
        return XMLStylesheetManager.getStbResumeHtml(stbxmlService.getList());
    }

    public String getById(String id) {
        try {
            return XMLStylesheetManager.getStbHtml(stbxmlService.getById(id));
        } catch (JAXBException | TransformerException | IOException e) {
            return StatusGenerator.generateStatusXML(id, "ERROR");
        }
    }
}
