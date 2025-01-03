package br.com.ltoledo.dao;

import java.util.List;

import br.com.ltoledo.dao.generic.IGenericDAO;
import br.com.ltoledo.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}