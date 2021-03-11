package com.topservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.topservice.model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long>{
	@Query(nativeQuery = true, value = "SELECT CODPARC, NOMEPARC, TIPPESSOA FROM TGFPAR WHERE CLIENTE = 'S' AND ATIVO = 'S' AND TIPPESSOA = 'J' AND ROWNUM < 600")
	List<Cliente> findAll();
	
	@Query(nativeQuery = true, value = "SELECT CODPARC, NOMEPARC, TIPPESSOA FROM TGFPAR WHERE CLIENTE = 'S' AND ATIVO = 'S' AND TIPPESSOA = 'J' AND codparc = :codparc")
	Cliente findByCodParc(@Param("codparc") Long codparc);
}
