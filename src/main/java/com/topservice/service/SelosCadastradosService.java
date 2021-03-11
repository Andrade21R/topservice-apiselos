package com.topservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.topservice.model.SeloCadastro;
import com.topservice.repository.SelosCadastradosRepository;
import com.topservice.service.exception.SeloNaoEncontradoException;

@Service
public class SelosCadastradosService {

	@Autowired
	private SelosCadastradosRepository selosCadastradosRepository;
	
	public List<SeloCadastro> listar() {
		return selosCadastradosRepository.findAll();
	}
	
	public SeloCadastro salvar(SeloCadastro selo) {
		Integer id = selosCadastradosRepository.maxId();
		selo.setId(id + 1L);
		return selosCadastradosRepository.save(selo);
	}
	
	public SeloCadastro buscarPorSelo(String selo) {
		SeloCadastro s = selosCadastradosRepository.findBySelo(selo);
		
		if (s == null) {
			throw new SeloNaoEncontradoException("Selo não pode ser encontrado!");
		}
		
		return s;
	}
	
}
