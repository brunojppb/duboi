package com.duboi.web.dao;

import java.util.List;

import com.duboi.web.models.Loja;

public interface LojaDAO {
	public void salvar(Loja loja);
	public void atualizar(Loja loja);
	public void excluir(Loja loja);
	public Loja carregar(Integer codigo);
	public List<Loja> listar();
}
