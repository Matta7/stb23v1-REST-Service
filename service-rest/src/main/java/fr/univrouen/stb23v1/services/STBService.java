package fr.univrouen.stb23v1.services;

import fr.univrouen.stb23v1.entities.STB;
import fr.univrouen.stb23v1.repositories.STBRepository;
import fr.univrouen.stb23v1.utils.StatusGenerator;
import fr.univrouen.stb23v1.utils.MarshalMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class STBService {

    @Autowired
    private STBRepository stbRepository;

    public String insert(String xml) {
        STB stb;
        try {
            stb = MarshalMethods.deserializeXml(xml);
        } catch (Exception e) {
            return StatusGenerator.generateStatusInsertXML("ERROR", "INVALID");
        }

        Iterable<STB> stbList = stbRepository.findAll();
        for (STB stbInList : stbList) {
            if (stbInList.getTitle().equals(stb.getTitle()) 
            && stbInList.getVersion() == stb.getVersion()
            && stbInList.getDate().equals(stb.getDate())) {
                return StatusGenerator.generateStatusInsertXML("ERROR", "DUPLICATED");
            }
        }

        try {
            stbRepository.save(stb);
        } catch (Exception e) {
            return StatusGenerator.generateStatusInsertXML("ERROR", "INVALID");
        }

        return StatusGenerator.generateStatusXML(stb.getId().toString(), "INSERTED");
    }

    public String delete(String id) {
        try {
            stbRepository.deleteById(id);
        } catch (Exception e) {
            return StatusGenerator.generateStatusXML(id, "ERROR");
        }

        return StatusGenerator.generateStatusXML(id, "DELETED");
    }
}
