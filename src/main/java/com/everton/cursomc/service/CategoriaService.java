package com.everton.cursomc.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.everton.cursomc.domain.Categoria;
import com.everton.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
		
		
	}
}
