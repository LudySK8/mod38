package br.com.ltoledo.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.ltoledo.dao.IClienteDAO;
import br.com.ltoledo.domain.Cliente;
import br.com.ltoledo.exceptions.DAOException;
import br.com.ltoledo.exceptions.MaisDeUmRegistroException;
import br.com.ltoledo.exceptions.TableException;
import br.com.ltoledo.services.generic.GenericService;

@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}