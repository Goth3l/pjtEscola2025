package com.nycolle.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nycolle.demo.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}
