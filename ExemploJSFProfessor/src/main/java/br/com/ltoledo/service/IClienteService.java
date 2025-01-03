package br.com.ltoledo.service;

import br.com.ltoledo.domain.Cliente;
import br.com.ltoledo.exceptions.DAOException;
import br.com.ltoledo.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}