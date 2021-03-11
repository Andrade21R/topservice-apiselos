package com.topservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.topservice.model.ProdutoCodigoBarra;
import com.topservice.service.ProdutosService;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutosService produtosService;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<ProdutoCodigoBarra>> listarProdutos() {
		List<ProdutoCodigoBarra> produtos = produtosService.listar();
		return ResponseEntity.status(HttpStatus.OK).body(produtos);
	}
	
	@RequestMapping(value = "/{codbarra}", method = RequestMethod.GET)
	public ResponseEntity<ProdutoCodigoBarra> buscarProduto(@PathVariable("codbarra") String codbarra) {
		ProdutoCodigoBarra produto = produtosService.buscar(codbarra);
		return ResponseEntity.status(HttpStatus.OK).body(produto);
	}

}
