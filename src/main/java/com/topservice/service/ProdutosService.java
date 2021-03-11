package com.topservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topservice.model.ProdutoCodigoBarra;
import com.topservice.repository.ProdutosRepository;
import com.topservice.service.exception.ProdutoNaoEncontradoException;

@Service
public class ProdutosService {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	public List<ProdutoCodigoBarra> listar() {
		return produtosRepository.findAll();
	}
	
	public ProdutoCodigoBarra buscar(String codbarra) {
		ProdutoCodigoBarra produto = produtosRepository.findByCodBarra(codbarra);
		if (produto == null) {
			throw new ProdutoNaoEncontradoException("O Produto não foi encontrado.");
		}
		
		return produto;
	}


}
