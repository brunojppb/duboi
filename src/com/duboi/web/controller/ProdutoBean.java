package com.duboi.web.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.duboi.web.models.PedidoProduto;
import com.duboi.web.models.Produto;
import com.duboi.web.regradenegocio.ProdutoRN;

@ManagedBean(name = "produtoBean")
@RequestScoped
public class ProdutoBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Produto produto;
	private List<Produto> produtos;
	private ProdutoRN produtoRN;
	
	public ProdutoBean(){
		this.produtoRN = new ProdutoRN();
		this.produto = new Produto();
		this.produto.setPedidos(new ArrayList<PedidoProduto>());
	}
	
	public void salvar(){
		this.produtoRN.salvar(this.produto);
		this.produto = new Produto();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		if(this.produtos == null)
			this.produtos = this.produtoRN.listar();
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
