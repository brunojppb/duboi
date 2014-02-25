package com.duboi.web.regradenegocio;

import java.util.List;

import com.duboi.web.dao.LojaDAO;
import com.duboi.web.models.Loja;
import com.duboi.web.util.DAOFactory;

public class LojaRN {
	private LojaDAO dao;
	
	
	public LojaRN(){
		this.dao = DAOFactory.criarLojaDAO();
	}
	
	public void salvar(Loja loja) {
		this.dao.salvar(loja);
		
	}
	
	public void atualizar(Loja loja) {
		// TODO Auto-generated method stub
		
	}

	public void excluir(Loja loja) {
		// TODO Auto-generated method stub
		
	}

	public Loja carregar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Loja> listar() {
		// TODO Auto-generated method stub
		return null;
	}
}
