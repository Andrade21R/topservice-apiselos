package com.topservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "TGFVOA")
public class ProdutoCodigoBarra {
	
	@Id
	@EqualsAndHashCode.Include
	@JsonIgnore
	@Column(name = "codprod")
	private Long codprod;
	
	@Column(name = "codbarra")
	private String codbarra;
	
	@OneToOne
	@JoinColumn(name = "codprod")
	private ProdutoDescricao produto;
	
}
