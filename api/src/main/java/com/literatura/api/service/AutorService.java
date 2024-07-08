package com.literatura.api.service;


import com.literatura.api.entity.Autor;
import com.literatura.api.repository.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public Autor salvarAutor(Autor autor) {
        return autorRepository.save(autor);
    }

    public List<Autor> listarAutores() {
        return autorRepository.findAll();
    }

    public List<Autor> listarAutoresPorAno(int ano) {
        return autorRepository.findAutoresByAno(ano);
    }
}
