package com.topservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topservice.model.Cliente;
import com.topservice.repository.ClientesRepository;
import com.topservice.service.exception.ClienteNaoEncontradoException;

@Service
public class ClientesService {
	
	@Autowired
	private ClientesRepository clientesRepository;
	
	public List<Cliente> listar() {
		return clientesRepository.findAll();
	}
	
	public Cliente buscar(Long codparc) {
		Cliente cliente = clientesRepository.findByCodParc(codparc);
		if (cliente == null) {
			throw new ClienteNaoEncontradoException("O Cliente não pode ser encontrado!");
		}
		
		return cliente;
	}


}
