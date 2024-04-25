package com.example.Noticias_Av1_Api.controller;

import com.example.Noticias_Av1_Api.service.NoticiaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticiaController {

    NoticiaService service = new NoticiaService();

    @GetMapping("/noticias")
    public String postarNoticia(){
        return service.postarNoticia();
    }
    @GetMapping("/releases")
    public String postarRelease(){
        return service.postarRelease();
    }
    @GetMapping("/noticiasereleases")
    public String postarNoticiasERelease(){
        return service.postarNoticiasERelease();
    }
}