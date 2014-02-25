package com.duboi.web.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Cliente cliente;
	
	@OneToMany(mappedBy="pedido", cascade=CascadeType.PERSIST)
	private List<PedidoProduto> produtos;
	
	@OneToOne
	private Pagamento pagamento;
	
	private boolean status;
	
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
