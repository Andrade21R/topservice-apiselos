package com.topservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "TGFPRO")
public class ProdutoDescricao {
	
	@Id
	@EqualsAndHashCode.Include
	@Column(name = "CODPROD")
	private Long codprod;
	
	@Column(name = "DESCRPROD")
	private String descrprod;
	
}
