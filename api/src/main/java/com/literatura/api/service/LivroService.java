package com.literatura.api.service;


import com.literatura.api.entity.Livro;
import com.literatura.api.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro salvarLivro(Livro livro) {
        return livroRepository.save(livro);

    }

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }
}
