package com.topservice.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.topservice.model.SeloCadastro;
import com.topservice.service.SelosCadastradosService;

@RestController
@RequestMapping(value = "/selos")
public class SelosCadastradosController {
	
	@Autowired
	private SelosCadastradosService selosCadastradosService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SeloCadastro>> listarSelos() {
		List<SeloCadastro> selos = selosCadastradosService.listar();
		return ResponseEntity.status(HttpStatus.OK).body(selos);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> salvarSelos(@RequestBody SeloCadastro selo) {
		selosCadastradosService.salvar(selo);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(selo.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{selo}", method = RequestMethod.GET)
	public ResponseEntity<SeloCadastro> buscarSeloPorSelo(@PathVariable("selo") String selo) {
		SeloCadastro s = selosCadastradosService.buscarPorSelo(selo);
		return ResponseEntity.status(HttpStatus.OK).body(s);
	}
}
