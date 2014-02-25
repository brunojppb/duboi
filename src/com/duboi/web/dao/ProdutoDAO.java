package com.duboi.web.dao;

import java.util.List;

import com.duboi.web.models.Produto;

public interface ProdutoDAO {
	public void salvar(Produto produto);
	public void atualizar(Produto produto);
	public void excluir(Produto produto);
	public Produto carregar(Integer codigo);
	public List<Produto> listar();
}
