package com.topservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topservice.model.Cliente;
import com.topservice.service.ClientesService;

@RestController
@RequestMapping(value = "/clientes")
public class ClientesController {
	
	@Autowired
	private ClientesService clientesService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> listarProdutos() {
		List<Cliente> clientes = clientesService.listar();
		return ResponseEntity.status(HttpStatus.OK).body(clientes);
	}
	
	@RequestMapping(value = "/{codparc}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> buscarProduto(@PathVariable("codparc") Long codparc) {
		Cliente cliente = clientesService.buscar(codparc);
		return ResponseEntity.status(HttpStatus.OK).body(cliente);
	}

}
