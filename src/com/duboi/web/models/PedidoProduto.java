package com.duboi.web.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@IdClass(PedidoProdutoId.class)
public class PedidoProduto {
	
	@Id
	@ManyToOne
	@JoinColumn(name="pedido_id")
	private Pedido pedido;
	
	@Id
	@ManyToOne
	@JoinColumn(name="produto_id")
	private Produto produto;
	
	private Integer quantidade;
	
	public PedidoProduto(){}
	
	public PedidoProduto(Pedido p, Produto pro, Integer quantidade){
		this.pedido = p;
		this.produto = pro;
		this.quantidade = quantidade;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
}
