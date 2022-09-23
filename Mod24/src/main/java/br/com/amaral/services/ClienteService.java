/**
 * 
 */
package br.com.amaral.services;


import br.com.amaral.dao.IClienteDAO;
import br.com.amaral.domain.Cliente;
import br.com.amaral.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author leandro.amaral
 *
 */
public class ClienteService implements IClienteService {
	
	private IClienteDAO clienteDAO; 
	
	public ClienteService(IClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}


	@Override
	public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		return clienteDAO.cadastrar(cliente);

	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return clienteDAO.consultar(cpf);
	}


	@Override
	public void excluir(Long cpf) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
		clienteDAO.alterar(cliente);
		
	}

}
