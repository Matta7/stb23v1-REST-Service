package fr.univrouen.stb23v1.model.api;

import org.springframework.web.client.RestTemplate;

public class HomeRequest {



    public String homePageRequest() {
        String uri = APIConstant.baseURL + "/";

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }

    public String helpPageRequest() {
        String uri = APIConstant.baseURL + "/help";

        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, String.class);
    }
}
