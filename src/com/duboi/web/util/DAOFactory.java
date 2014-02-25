package com.duboi.web.util;

import com.duboi.web.dao.LojaDAO;
import com.duboi.web.dao.LojaDAOHibernate;
import com.duboi.web.dao.ProdutoDAO;
import com.duboi.web.dao.ProdutoDAOHibernate;

public class DAOFactory {
	
	public static ProdutoDAO criarProdutoDAO(){
		ProdutoDAOHibernate dao = new ProdutoDAOHibernate();
		dao.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return dao;
	}

	public static LojaDAO criarLojaDAO() {
		LojaDAOHibernate dao = new LojaDAOHibernate();
		dao.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return dao;
	}
	
}
