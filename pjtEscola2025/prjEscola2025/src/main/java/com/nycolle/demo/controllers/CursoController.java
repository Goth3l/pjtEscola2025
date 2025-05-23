package com.nycolle.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.nycolle.demo.entities.Curso;
import com.nycolle.demo.service.CursoService;

public class CursoController {

private final CursoService cursoService;
	
	@Autowired
	public CursoController (CursoService cursoService) {
		this.cursoService = cursoService;
	}
	
	@PostMapping("/create")
	public Curso createCurso( @RequestBody Curso curso) {
		return cursoService.saveCurso(curso);
	}
	
	@GetMapping("/{id}")
	public Curso getCurso( @PathVariable Long id) {
		return cursoService.findCursoById(id);
	}
	
	@GetMapping("/all")
	public List<Curso> getAllCursos() {
		return cursoService.findAllCursos();
	}
}
