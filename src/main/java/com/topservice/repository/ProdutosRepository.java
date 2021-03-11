package com.topservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.topservice.model.ProdutoCodigoBarra;

public interface ProdutosRepository extends JpaRepository<ProdutoCodigoBarra, Long> {

	@Query(nativeQuery = true, value = "SELECT V.CODPROD, P.DESCRPROD, V.CODBARRA  FROM TGFVOA V INNER JOIN TGFPRO P ON P.CODPROD = V.CODPROD WHERE ROWNUM < 600")
	List<ProdutoCodigoBarra> findAll();

	@Query(nativeQuery = true, value = "SELECT V.CODPROD, P.DESCRPROD, V.CODBARRA  FROM TGFVOA V INNER JOIN TGFPRO P ON P.CODPROD = V.CODPROD WHERE V.CODBARRA = :codbarra AND ROWNUM = 1")
	ProdutoCodigoBarra findByCodBarra(@Param("codbarra") String codbarra);

}
