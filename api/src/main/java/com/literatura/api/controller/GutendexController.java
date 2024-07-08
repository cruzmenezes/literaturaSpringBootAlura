package com.literatura.api.controller;


import com.literatura.api.service.GutendexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gutendex")
public class GutendexController {

    @Autowired
    private GutendexService gutendexService;

    @GetMapping("/buscar")
    public String buscarLivroPorTitulo(@RequestParam String titulo) {
        return gutendexService.buscarLivroPorTitulo(titulo);
    }

}
