package com.topservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TGFPAR")
public class Cliente {
	
	@Id
	@Column(name = "CODPARC")
	private Long codparc;
	
	@Column(name = "NOMEPARC")
	private String nomeparc;
	
	@Column(name = "TIPPESSOA")
	private String tippessoa;

}
