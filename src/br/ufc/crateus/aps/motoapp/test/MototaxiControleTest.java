package br.ufc.crateus.aps.motoapp.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ufc.crateus.aps.motoapp.controle.MototaxiControle;
import br.ufc.crateus.aps.motoapp.controle.entidade.DadosBancarios;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioCliente;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioMototaxi;

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
		 
		boolean b = mr.cadastrarMotoTaxi(m);
		
		Assert.assertTrue(b);
		 
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
		 m = mr.autenticarMototaxi("mototaxi", "321");
		 
		 Assert.assertNotNull(m);
		
	}
	
	

}
