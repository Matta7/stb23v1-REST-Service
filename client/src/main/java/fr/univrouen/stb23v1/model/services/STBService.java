package fr.univrouen.stb23v1.model.services;

import fr.univrouen.stb23v1.model.api.STBRequest;
import fr.univrouen.stb23v1.model.entities.ResultSTBList;
import fr.univrouen.stb23v1.model.entities.STB;
import fr.univrouen.stb23v1.model.utils.MarshalMethods;
import org.springframework.stereotype.Service;

@Service
public class STBService {

    STBRequest stbRequest = new STBRequest();

    public ResultSTBList getSTBList() {
        String result = stbRequest.listRequest();

        ResultSTBList resultSTBList = MarshalMethods.deserializeXmlList(result);

        return resultSTBList;
    }

    public STB getSTBDetail(String id) {
        String result = stbRequest.detailRequest(id);

        STB stb = MarshalMethods.deserializeXml(result);

        return stb;
    }
}
