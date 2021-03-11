package com.topservice.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "AD_CADASTROSELO")
public class SeloCadastro {
	
	@Id
	private Long id;
	
	private Long codprod;
	
	private String selo;
	
	private String descrprod;
	
	private String usuario;
	
	private String numnota;
	
	@JsonFormat(pattern="dd-MM-yyyy HH:mm:ss")
	private LocalDateTime data;
}
