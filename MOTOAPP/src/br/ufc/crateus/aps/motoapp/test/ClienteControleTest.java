package br.ufc.crateus.aps.motoapp.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ufc.crateus.aps.motoapp.controle.ClienteControle;
import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;
import br.ufc.crateus.aps.motoapp.controle.entidade.DadosBancarios;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioCliente;

public class ClienteControleTest {

	@Test
	public void cadastrarCliente() {
		Cliente c = new Cliente();
		ClienteControle rc = ClienteControle.getInstancia();

		c.setLogin("user");
		c.setSenha("123");
		c.setNome("denilson");
		c.setCPF("123.123.132-90");
		c.setRG("2323");
		c.setTelefone("1235678976");
		c.setDataNascimento("12/23/1023");
		c.setDadosBancarios(new DadosBancarios());
		c.setEmail("user@gmail.com");

		 rc.cadastrarCliente(c);

		Assert.assertNotNull(rc.consultarClientes());

	}
	
	@Before
	public void clear() {
		RepositorioCliente rc = new RepositorioCliente();
		rc.clearAllClientes();
	}

	@Test
	public void autenticarCliente() {
		Cliente c = new Cliente();
		ClienteControle rc = ClienteControle.getInstancia();

		c.setLogin("user");
		c.setSenha("123");
		c.setNome("denilson");
		c.setCPF("123.123.132-90");
		c.setRG("2323");
		c.setTelefone("1235678976");
		c.setDataNascimento("12/23/1023");
		c.setDadosBancarios(new DadosBancarios());
		c.setEmail("user@gmail.com");

		rc.cadastrarCliente(c);

		c = rc.autenticarCliente("user", "123");

		Assert.assertNotNull(c);
	}

}
