package com.literatura.api.controller;

import com.literatura.api.entity.Livro;
import com.literatura.api.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    @Autowired
    private LivroService livroService;

    @PostMapping
    public Livro adicionarLivro(@RequestBody Livro livro) {
        return livroService.salvarLivro(livro);
    }

    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listarLivros();
    }
}
