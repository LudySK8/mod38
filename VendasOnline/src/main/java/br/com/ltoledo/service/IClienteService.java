package br.com.ltoledo.service;

import java.util.List;

import br.com.ltoledo.domain.Cliente;
import br.com.ltoledo.exceptions.DAOException;
import br.com.ltoledo.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}