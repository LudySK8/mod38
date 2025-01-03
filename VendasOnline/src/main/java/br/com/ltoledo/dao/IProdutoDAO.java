package br.com.ltoledo.dao;

import java.util.List;

import br.com.ltoledo.dao.generic.IGenericDAO;
import br.com.ltoledo.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}