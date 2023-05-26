package fr.univrouen.stb23v1.model.api;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

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

    public String insertRequest(String xml) throws IOException {
        String uri = APIConstant.baseURL + "/stb23/insert";

        HttpClient httpclient = HttpClients.createDefault();
        HttpPost httppost = new HttpPost(uri);

        httppost.setHeader("Content-Type", "application/xml");

        HttpEntity requestEntity = new StringEntity(xml, ContentType.APPLICATION_XML);
        httppost.setEntity(requestEntity);

        HttpResponse response = httpclient.execute(httppost);

        String responseBody = new BasicResponseHandler().handleResponse(response);

        return responseBody;
    }

    public String deleteRequest(String id) throws IOException {
        String uri = APIConstant.baseURL + "/stb23/delete/" + id;

        CloseableHttpClient httpclient = HttpClients.createDefault();

        HttpDelete httpDel = new HttpDelete(uri);

        HttpResponse response = httpclient.execute(httpDel);

        String responseBody = new BasicResponseHandler().handleResponse(response);

        return responseBody;
    }
}
