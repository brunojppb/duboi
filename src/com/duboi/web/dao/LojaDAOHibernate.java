package com.duboi.web.dao;

import java.util.List;

import org.hibernate.Session;

import com.duboi.web.models.Loja;

public class LojaDAOHibernate implements LojaDAO{
	
private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}
	
	@Override
	public void salvar(Loja loja) {
		this.session.save(loja);
		
	}

	@Override
	public void atualizar(Loja loja) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Loja loja) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Loja carregar(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loja> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
