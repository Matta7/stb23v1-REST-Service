package fr.univrouen.stb23v1.model.api;

import org.springframework.web.client.RestTemplate;

public class STBRequest {

    public String listRequest() {
        String uri = APIConstant.baseURL + "/stb23/resume/xml";

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }

    public String detailRequest(String id) {
        String uri = APIConstant.baseURL + "/stb23/xml/" + id;

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }
}
