package com.duboi.web.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Pedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private Cliente cliente;
	
	@OneToMany(mappedBy = "pedido")
	private List<PedidoProduto> produtos;
	
	@OneToOne
	private Pagamento pagamento;
	
	public Pedido(){}
	
	public Pedido(Cliente c){
		this.cliente = c;
		this.produtos = new ArrayList<PedidoProduto>();
	}
	
	public Pedido(Cliente c, List<PedidoProduto> produtos){
		this.cliente = c;
		this.produtos = produtos;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<PedidoProduto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<PedidoProduto> produtos) {
		this.produtos = produtos;
	}

	public void addPedidoProduto(PedidoProduto p){
		this.produtos.add(p);
	}
	
	public void removerProduto(Produto p){
		if(this.produtos.contains(p)){
			this.produtos.remove(p);
		}
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}
	
}
