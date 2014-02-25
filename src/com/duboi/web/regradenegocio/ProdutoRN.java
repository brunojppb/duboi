package com.duboi.web.regradenegocio;

import java.util.List;

import com.duboi.web.dao.ProdutoDAO;
import com.duboi.web.models.Produto;
import com.duboi.web.util.DAOFactory;

public class ProdutoRN {
	private ProdutoDAO dao;
	
	public ProdutoRN(){
		this.dao = DAOFactory.criarProdutoDAO();
	}
	
	public void salvar(Produto produto){
		Integer codigo = produto.getId();
		if(codigo == null || codigo == 0)
			this.dao.salvar(produto);
		else
			this.dao.atualizar(produto);
		
	}
	
	public void atualizar(Produto produto){
		this.dao.atualizar(produto);
	}
	
	public void excluir(Produto produto){
		this.dao.excluir(produto);
	}
	
	public Produto carregar(Integer codigo){
		return this.dao.carregar(codigo);
	}
	
	public List<Produto> listar(){
		return this.dao.listar();
	}
}
