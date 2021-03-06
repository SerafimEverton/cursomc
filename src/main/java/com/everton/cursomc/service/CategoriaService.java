package com.everton.cursomc.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.everton.cursomc.domain.Categoria;
import com.everton.cursomc.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
		
	}
}
