package com.duboi.web.controller;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.duboi.web.models.Loja;
import com.duboi.web.regradenegocio.LojaRN;

@ManagedBean(name="lojaBean")
@RequestScoped
public class LojaBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Loja loja;
	private LojaRN lojaRN;
	
	public LojaBean(){
		this.loja = new Loja();
		this.lojaRN = new LojaRN();
	}
	
	public void salvar(){
		this.lojaRN.salvar(loja);
		this.loja = new Loja();
	}

	public Loja getLoja() {
		return loja;
	}

	public void setLoja(Loja loja) {
		this.loja = loja;
	}		
}
