package com.duboi.web.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	private String nome;
	private String tipo;
	private double precoLoja;
	private double precoTerceiro;
	
	@OneToMany(mappedBy="produto")
	private List<PedidoProduto> pedidos;
	
	public Produto(){}
	
	public Produto(String nome, String tipo, double precoLoja, double precoTerceiro){
		this.nome = nome;
		this.tipo = tipo;
		this.precoLoja = precoLoja;
		this.precoTerceiro = precoTerceiro;
		
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPrecoLoja() {
		return precoLoja;
	}
	public void setPrecoLoja(double precoLoja) {
		this.precoLoja = precoLoja;
	}
	public double getPrecoTerceiro() {
		return precoTerceiro;
	}
	public void setPrecoTerceiro(double precoTerceiro) {
		this.precoTerceiro = precoTerceiro;
	}

	public List<PedidoProduto> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<PedidoProduto> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void addPedidoProduto(PedidoProduto p){
		this.pedidos.add(p);
	}
	
	public void removerPedidoProduto(PedidoProduto p){
		if(this.pedidos.contains(p))
			this.pedidos.add(p);
	}
	
}
