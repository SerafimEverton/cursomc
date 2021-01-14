package com.everton.cursomc.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.everton.cursomc.domain.Pedido;
import com.everton.cursomc.repositories.PedidoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PedidoService {
	
	private PedidoRepository repo;

	public Pedido buscar(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
		
		
	}
}
