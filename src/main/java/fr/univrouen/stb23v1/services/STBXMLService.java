package fr.univrouen.stb23v1.services;

import fr.univrouen.stb23v1.entities.STB;
import fr.univrouen.stb23v1.repositories.STBRepository;
import fr.univrouen.stb23v1.utils.StatusGenerator;
import jakarta.xml.bind.JAXBException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
public class STBXMLService {

    @Autowired
    private STBRepository stbRepository;

    public String getList() {
        Iterable<STB> stbList = stbRepository.findAll();
        /*STBs stbs = new STBs();
        for(STB stb : stbList) {
            stbs.addSTB(stb);
        }
        return stbs;*/

        StringBuilder result = new StringBuilder("<result>\n");
        for (STB stb : stbList) {
            result.append("<stb id=\"").append(stb.getId()).append("\">\n");
            result.append("<title>").append(stb.getTitle()).append("</title>\n");
            result.append("<description>").append(stb.getDescription()).append("</description>\n");
            result.append("<date>").append(stb.getDate()).append("</date>\n");
            result.append("<client-entity>").append(stb.getClient().getEntity()).append("</client-entity>\n");
            result.append("</stb>\n");
        }
        result.append("</result>");

        return result.toString();
    }

    public STB getById(String id) {
        return stbRepository.findById(id).orElse(null);
        /*try {

        } catch (Exception e) {
            return StatusGenerator.generateStatusXML(id, "ERROR");
        }*/
    }
}
