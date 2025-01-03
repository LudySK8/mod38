package br.com.ltoledo.service;

import java.util.List;

import br.com.ltoledo.domain.Produto;
import br.com.ltoledo.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}