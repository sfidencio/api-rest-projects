package com.github.sfidencio.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.sfidencio.domain.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{ 
}
