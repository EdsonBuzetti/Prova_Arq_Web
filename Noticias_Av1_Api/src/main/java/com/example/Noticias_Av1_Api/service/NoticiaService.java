package com.example.Noticias_Av1_Api.service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class NoticiaService {
    public String postarNoticia() {
        String noticiaPostada = "";

        String apiUrl = "https://servicodados.ibge.gov.br/api/v3/noticias";


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            noticiaPostada = responseEntity.getBody();
        } else {
            noticiaPostada = "Falha ao obter noticias. Código de status: " + responseEntity.getStatusCode();
        }
        return noticiaPostada;
    }
    public String postarRelease() {
        String releasePostado = "";

        String apiUrl = "https://servicodados.ibge.gov.br/api/v3/noticias/?tipo=release";


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            releasePostado = responseEntity.getBody();
        } else {
            releasePostado = "Falha ao obter releases. Código de status: " + responseEntity.getStatusCode();
        }
        return releasePostado;
    }
    public String postarNoticiasERelease() {
        String releaseENoticiaPostado = "";

        String apiUrl = "https://servicodados.ibge.gov.br/api/v3/noticias";


        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            releaseENoticiaPostado = responseEntity.getBody();
        } else {
            releaseENoticiaPostado = "Falha ao obter noticia e releases. Código de status: " + responseEntity.getStatusCode();
        }
        return releaseENoticiaPostado;
    }
}
