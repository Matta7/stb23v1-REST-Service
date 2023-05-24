package fr.univrouen.stb23v1.services;

import fr.univrouen.stb23v1.entities.STB;
import fr.univrouen.stb23v1.entities.STBs;
import fr.univrouen.stb23v1.repositories.STBRepository;
import fr.univrouen.stb23v1.utils.MarshalMethods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;


@Service
public class STBXMLService {

    @Autowired
    private STBRepository stbRepository;

    public STBs getList() {
        Iterable<STB> stbList = stbRepository.findAll();
        STBs stbs = new STBs();
        for(STB stb : stbList) {
            stbs.addSTB(stb);
        }
        return stbs;
    }

    public STB getById(String id) {
        return stbRepository.findById(id).orElse(null);
    }

    public String save() throws IOException {
        Resource resource = new DefaultResourceLoader().getResource("classpath:/xml/stb23.tp1.xml");
        STB stb = MarshalMethods.deserializeXml(resource.getFile());

        try {
            stbRepository.save(stb);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "zrnuinzfzen";
    }
}
