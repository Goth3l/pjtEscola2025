package com.nycolle.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nycolle.demo.entities.Aluno;
import com.nycolle.demo.repositories.AlunoRepository;

@Service
public class AlunoService {

private final AlunoRepository alunoRepository;
	
	public AlunoService(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	public Aluno findAlunoById(Long id) {
		Optional<Aluno> aluno = alunoRepository.findById(id);
		return aluno.orElse(null);
	}
	
	public List<Aluno> findAllAlunos() {
		return alunoRepository.findAll();
	}
	
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
}
