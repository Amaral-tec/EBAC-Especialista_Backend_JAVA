/**
 * 
 */
package br.com.amaral;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.amaral.dao.ClienteDaoMock;
import br.com.amaral.dao.IClienteDAO;
import br.com.amaral.domain.Cliente;
import br.com.amaral.exceptions.TipoChaveNaoEncontradaException;

/**
 * @author leandro.amaral
 *
 */
public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest( ) {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		cliente = new Cliente();
		cliente.setCpf(11122233344L);
		cliente.setNome("Fulano de Tal");
		cliente.setTelefone(000111112222L);
		cliente.setEmail("teste@email.com");
		cliente.setEndereco("Rua teste");
		cliente.setNumero(1);
		cliente.setBairro("Teste");
		cliente.setCidade("Teste");
		cliente.setEstado("Teste");
		cliente.setCep(50000000L);
		clienteDao.cadastrar(cliente);	
	}
	
	@Test
	public void pesquisarCliente( ) {	
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente( ) throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Fulano de Tal da Silva");
/*		cliente.setTelefone(999111112222L);
		cliente.setEmail("testealteracao@email.com");
		cliente.setEndereco("Rua TesteAlteracao");
		cliente.setNumero(2);
		cliente.setBairro("TesteAlteracao");
		cliente.setCidade("TesteAlteracao");
		cliente.setEstado("TesteAlteracao");
		cliente.setCep(99999999L);	*/	
		
		clienteDao.alterar(cliente);
		Assert.assertEquals("Fulano de Tal da Silva", cliente.getNome());
	}
}
