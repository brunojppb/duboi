package com.duboi.web.dao;

import java.util.List;

import org.hibernate.Session;

import com.duboi.web.models.Produto;

public class ProdutoDAOHibernate implements ProdutoDAO{
	
private Session session;
	
	public void setSession(Session s){
		this.session = s;
	}

	@Override
	public void salvar(Produto produto) {
		this.session.save(produto);
	}

	@Override
	public void atualizar(Produto produto) {
		this.session.update(produto);
		
	}

	@Override
	public void excluir(Produto produto) {
		this.session.delete(produto);
		
	}

	@Override
	public Produto carregar(Integer codigo) {
		return (Produto) this.session.get(Produto.class, codigo);
	}

	@Override
	@SuppressWarnings(value="all")
	public List<Produto> listar() {
		return this.session.createCriteria(Produto.class).list();
	}

}
