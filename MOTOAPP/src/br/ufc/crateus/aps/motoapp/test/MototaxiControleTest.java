package br.ufc.crateus.aps.motoapp.test;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ufc.crateus.aps.motoapp.controle.ClienteControle;
import br.ufc.crateus.aps.motoapp.controle.MototaxiControle;
import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;
import br.ufc.crateus.aps.motoapp.controle.entidade.DadosBancarios;
import br.ufc.crateus.aps.motoapp.controle.entidade.Localizacao;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioCliente;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioMototaxi;
import br.ufc.crateus.aps.motoapp.padroes.factory.TipoSmartphone;

public class MototaxiControleTest {
	
	@Test
	public void cadastrarMotoTaxi() {
		Mototaxi m = new Mototaxi();
		MototaxiControle mr =  MototaxiControle.getInstancia();
		
		 m.setLogin("mototaxi");
		 m.setSenha("321");
		 m.setNome("mototaxi");
		 m.setCPF("123.123.132-90");
		 m.setRG("2323");
		 m.setTelefone("1235678976");
		 m.setDataNascimento("12/23/1023");
		 m.setDadosBancarios(new DadosBancarios());
		 m.setEmail("mototaxi@gmail.com");
		 m.setCNH("321");
		 
		mr.cadastrarMotoTaxi(m);
		
		Assert.assertNotNull(mr.consultarMototaxis());
		 
	}
	
	@Before
	public void clear() {
		RepositorioMototaxi rm = new RepositorioMototaxi();
		rm.clearAllMototaxis();
	}
	
	@Test
	public void autenticarMototaxi(){
		Mototaxi m = new Mototaxi();
		MototaxiControle mr =  MototaxiControle.getInstancia();
		
		 m.setLogin("mototaxi");
		 m.setSenha("321");
		 m.setNome("mototaxi");
		 m.setCPF("123.123.132-90");
		 m.setRG("2323");
		 m.setTelefone("1235678976");
		 m.setDataNascimento("12/23/1023");
		 m.setDadosBancarios(new DadosBancarios());
		 m.setEmail("mototaxi@gmail.com");
		 m.setCNH("321");
		 
		 mr.cadastrarMotoTaxi(m);
		 mr.autenticarMototaxi("mototaxi", "321");
		 
		 Assert.assertNotNull(mr.consultarMototaxis());
		
	}
	
	@Test
	public void obterMototaxi() {
		Mototaxi m = new Mototaxi();
		MototaxiControle mr =  MototaxiControle.getInstancia();
		
		 m.setLogin("mototaxi");
		 m.setSenha("321");
		 m.setNome("mototaxi");
		 m.setCPF("123.123.132-90");
		 m.setRG("2323");
		 m.setTelefone("1235678976");
		 m.setDataNascimento("12/23/1023");
		 m.setDadosBancarios(new DadosBancarios());
		 m.setLocalizacao(new Localizacao(30, 40));
		 m.setEmail("mototaxi@gmail.com");
		 m.setCNH("321");
		 
		 mr.cadastrarMotoTaxi(m);
		 mr.autenticarMototaxi("mototaxi", "321");
		 
		 Cliente c = new Cliente();

			c.setLogin("user");
			c.setSenha("123");
			c.setNome("denilson");
			c.setCPF("123.123.132-90");
			c.setRG("2323");
			c.setTelefone("1235678976");
			c.setDataNascimento("12/23/1023");
			c.setDadosBancarios(new DadosBancarios());
			c.setLocalizacao(new Localizacao(30, 40));
			c.setEmail("user@gmail.com");

			Assert.assertNotNull(mr.obterMototaxi(c, 0));
	}
	
	@Test
	public void alertarArea(){
		Mototaxi m = new Mototaxi();
		MototaxiControle mr =  MototaxiControle.getInstancia();
		
		 m.setLogin("mototaxi");
		 m.setSenha("321");
		 m.setNome("mototaxi");
		 m.setCPF("123.123.132-90");
		 m.setRG("2323");
		 m.setTelefone("1235678976");
		 m.setSmartphone(TipoSmartphone.Android);
		 m.setDataNascimento("12/23/1023");
		 m.setDadosBancarios(new DadosBancarios());
		 m.setEmail("mototaxi@gmail.com");
		 m.setCNH("321");
		 
		 mr.cadastrarMotoTaxi(m);
		 mr.autenticarMototaxi("mototaxi", "321");
		 
		 mr.alertarArea(m);
		
	}

}
