package com.literatura.api.service;

import org.springframework.web.client.RestTemplate;

public class GutendexService {
    private final String API_URL = "https://gutendex.com/books";

    public String buscarLivroPorTitulo(String titulo) {
        RestTemplate restTemplate = new RestTemplate();
        String url = API_URL + "?search=" + titulo;
        return restTemplate.getForObject(url, String.class);
    }
}
