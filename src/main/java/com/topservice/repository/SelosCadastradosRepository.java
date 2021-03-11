package com.topservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.topservice.model.SeloCadastro;

public interface SelosCadastradosRepository extends JpaRepository<SeloCadastro, Long>{
	@Query(nativeQuery = true, value = "SELECT MAX(ID) FROM AD_CADASTROSELO")
	Integer maxId();
	
	@Query(nativeQuery = true, value = "SELECT * FROM AD_CADASTROSELO WHERE selo = :selo")
	SeloCadastro findBySelo(@Param("selo") String selo);
}
