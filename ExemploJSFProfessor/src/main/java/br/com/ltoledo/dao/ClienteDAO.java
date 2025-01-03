package br.com.ltoledo.dao;

import br.com.ltoledo.dao.generic.GenericDAO;
import br.com.ltoledo.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}