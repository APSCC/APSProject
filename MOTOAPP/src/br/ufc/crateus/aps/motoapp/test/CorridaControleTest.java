package br.ufc.crateus.aps.motoapp.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ufc.crateus.aps.motoapp.controle.CorridaControle;
import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;
import br.ufc.crateus.aps.motoapp.controle.entidade.Corrida;
import br.ufc.crateus.aps.motoapp.controle.entidade.DadosBancarios;
import br.ufc.crateus.aps.motoapp.controle.entidade.Localizacao;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioCorrida;
import br.ufc.crateus.aps.motoapp.padroes.factory.TipoSmartphone;

	public class CorridaControleTest {

	@Before
	public void clear() {
		RepositorioCorrida rc = new RepositorioCorrida();
		rc.clearAllCorridas();
	}

	@Test
	public void perdirCorrida() {
		CorridaControle cc = new CorridaControle();
		Mototaxi m = new Mototaxi();
		Cliente c = new Cliente();

		c.setLogin("user");
		c.setSenha("123");
		c.setNome("denilson");
		c.setCPF("123.123.132-90");
		c.setSmartphone(TipoSmartphone.IOS);
		c.setRG("2323");
		c.setTelefone("1235678976");
		c.setDataNascimento("12/23/1023");
		c.setDadosBancarios(new DadosBancarios());
		c.setEmail("user@gmail.com");

		m.setLogin("mototaxi");
		m.setSenha("321");
		m.setNome("mototaxi");
		m.setCPF("123.123.132-90");
		m.setSmartphone(TipoSmartphone.Android);
		m.setRG("2323");
		m.setTelefone("1235678976");
		m.setDataNascimento("12/23/1023");
		m.setDadosBancarios(new DadosBancarios());
		m.setEmail("mototaxi@gmail.com");
		m.setCNH("321");

		Localizacao destino = new Localizacao(1.0, 4.6);

		Corrida co = cc.perdirCorrida(c, m, destino, "CARTAO");

		Assert.assertNotNull(cc.consultarMinhasCorridas(m));

	}

	@Test
	public void cadastrarCorrida() {
		CorridaControle cc = new CorridaControle();
		Mototaxi m = new Mototaxi();
		Cliente c = new Cliente();

		c.setLogin("user");
		c.setSenha("123");
		c.setNome("denilson");
		c.setCPF("123.123.132-90");
		c.setSmartphone(TipoSmartphone.IOS);
		c.setRG("2323");
		c.setTelefone("1235678976");
		c.setDataNascimento("12/23/1023");
		c.setDadosBancarios(new DadosBancarios());
		c.setEmail("user@gmail.com");

		m.setLogin("mototaxi");
		m.setSenha("321");
		m.setNome("mototaxi");
		m.setCPF("123.123.132-90");
		m.setSmartphone(TipoSmartphone.Android);
		m.setRG("2323");
		m.setTelefone("1235678976");
		m.setDataNascimento("12/23/1023");
		m.setDadosBancarios(new DadosBancarios());
		m.setEmail("mototaxi@gmail.com");
		m.setCNH("321");

		Localizacao destino = new Localizacao(1.0, 4.6);

		Corrida co = cc.perdirCorrida(c, m, destino, "CARTAO");
		
		Assert.assertNotNull(cc.consultarMinhasCorridas(m));

	}

	@Test
	public void consultarMinhasCorridas(){
	
		
		CorridaControle cc = new CorridaControle();
		Mototaxi m = new Mototaxi();
		Cliente c = new Cliente();

		c.setLogin("user");
		c.setSenha("123");
		c.setNome("denilson");
		c.setCPF("123.123.132-90");
		c.setSmartphone(TipoSmartphone.IOS);
		c.setRG("2323");
		c.setTelefone("1235678976");
		c.setDataNascimento("12/23/1023");
		c.setDadosBancarios(new DadosBancarios());
		c.setEmail("user@gmail.com");

		m.setLogin("mototaxi");
		m.setSenha("321");
		m.setNome("mototaxi");
		m.setCPF("123.123.132-90");
		m.setSmartphone(TipoSmartphone.Android);
		m.setRG("2323");
		m.setTelefone("1235678976");
		m.setDataNascimento("12/23/1023");
		m.setDadosBancarios(new DadosBancarios());
		m.setEmail("mototaxi@gmail.com");
		m.setCNH("321");

		Localizacao destino = new Localizacao(1.0, 4.6);

		Corrida co = cc.perdirCorrida(c, m, destino, "CARTAO");
		
		cc.cadastrarCorrida(co);
		
		Assert.assertNotNull(cc.consultarMinhasCorridas(m));
	}
	
	@Test
	public void confirmarCorrida(){
	
		
		CorridaControle cc = new CorridaControle();
		Mototaxi m = new Mototaxi();
		Cliente c = new Cliente();

		c.setLogin("user");
		c.setSenha("123");
		c.setNome("denilson");
		c.setCPF("123.123.132-90");
		c.setSmartphone(TipoSmartphone.IOS);
		c.setRG("2323");
		c.setTelefone("1235678976");
		c.setDataNascimento("12/23/1023");
		c.setDadosBancarios(new DadosBancarios());
		c.setEmail("user@gmail.com");

		m.setLogin("mototaxi");
		m.setSenha("321");
		m.setNome("mototaxi");
		m.setCPF("123.123.132-90");
		m.setSmartphone(TipoSmartphone.Android);
		m.setRG("2323");
		m.setTelefone("1235678976");
		m.setDataNascimento("12/23/1023");
		m.setDadosBancarios(new DadosBancarios());
		m.setEmail("mototaxi@gmail.com");
		m.setCNH("321");

		Localizacao destino = new Localizacao(1.0, 4.6);

		Corrida co = cc.perdirCorrida(c, m, destino, "CARTAO");
		
		
			cc.confirmarCorrida(co);
			
			Assert.assertNotNull(cc.consultarMinhasCorridas(m));
	}
}
