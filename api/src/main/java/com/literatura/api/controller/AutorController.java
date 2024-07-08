package com.literatura.api.controller;


import com.literatura.api.entity.Autor;
import com.literatura.api.service.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autores")
public class AutorController {


    @Autowired
    private AutorService autorService;

    @PostMapping
    public Autor adicionarAutor(@RequestBody Autor autor) {
        return autorService.salvarAutor(autor);
    }

    @GetMapping
    public List<Autor> listarAutores() {
        return autorService.listarAutores();
    }

    @GetMapping("/ano/{ano}")
    public List<Autor> listarAutoresPorAno(@PathVariable int ano) {
        return autorService.listarAutoresPorAno(ano);
    }
}
