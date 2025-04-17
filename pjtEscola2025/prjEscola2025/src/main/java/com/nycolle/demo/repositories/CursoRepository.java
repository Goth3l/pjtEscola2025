package com.nycolle.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nycolle.demo.entities.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

	
}
