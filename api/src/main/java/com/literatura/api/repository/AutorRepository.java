package com.literatura.api.repository;

import com.literatura.api.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Long> {

    @Query("SELECT a FROM Autor a WHERE :ano BETWEEN EXTRACT(YEAR FROM a.dataNascimento) AND EXTRACT(YEAR FROM a.dataFalecimento)")
    List<Autor> findAutoresByAno(@Param("ano") int ano);
}
