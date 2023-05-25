package fr.univrouen.stb23v1.services;

import fr.univrouen.stb23v1.entities.STB;
import fr.univrouen.stb23v1.repositories.STBRepository;
import fr.univrouen.stb23v1.utils.MarshalMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class STBService {

    @Autowired
    private STBRepository stbRepository;

    public String insert(String xml) {
        STB stb = MarshalMethods.deserializeXml(xml);
        assert stb != null;
        stbRepository.save(stb);
        return "";
    }

    public String delete(String id) {
        stbRepository.deleteById(id);
        return "";
    }
}
