package com.duboi.web.models;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("terceiro")
public class Terceiro extends Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Terceiro(){}
	
	public Terceiro(String nome, String cnpj, String endereco, String email){
		super(nome, cnpj, endereco, email);
	}
	
}
