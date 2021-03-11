package com.topservice.service.exception;

public class SeloNaoEncontradoException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SeloNaoEncontradoException(String mensagem) {
		super(mensagem);
	}
	
	public SeloNaoEncontradoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
