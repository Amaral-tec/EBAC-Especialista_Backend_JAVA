
package br.com.amaral.dao;

import br.com.amaral.dao.generics.GenericDAO;
import br.com.amaral.domain.Cliente;

/**
 * @author leandro.amaral
 *
 */
public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {
	
	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		// TODO Auto-generated method stub
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}


}
