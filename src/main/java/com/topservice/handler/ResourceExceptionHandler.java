package com.topservice.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.topservice.domain.DetalhesErro;
import com.topservice.service.exception.ClienteNaoEncontradoException;
import com.topservice.service.exception.ProdutoNaoEncontradoException;
import com.topservice.service.exception.SeloNaoEncontradoException;

@ControllerAdvice
public class ResourceExceptionHandler {

	@ExceptionHandler(ProdutoNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleLivroNaoEncontradoException
							(ProdutoNaoEncontradoException p, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("O Produto não pôde ser encontrado");
		erro.setMensagemDesenvolvedor("http://erros.produtos.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(SeloNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleSeloNaoEncontradoException
							(SeloNaoEncontradoException s, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("O Selo cadastrado não pôde ser encontrado");
		erro.setMensagemDesenvolvedor("http://erros.produtos.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
	@ExceptionHandler(ClienteNaoEncontradoException.class)
	public ResponseEntity<DetalhesErro> handleClienteNaoEncontradoException
							(ClienteNaoEncontradoException s, HttpServletRequest request) {
		
		DetalhesErro erro = new DetalhesErro();
		erro.setStatus(404l);
		erro.setTitulo("O Cliente não pôde ser encontrado");
		erro.setMensagemDesenvolvedor("http://erros.produtos.com/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
	
}