package br.ufc.crateus.aps.motoapp;

import java.util.ArrayList;

import br.ufc.crateus.aps.motoapp.controle.ClienteControle;
import br.ufc.crateus.aps.motoapp.controle.CorridaControle;
import br.ufc.crateus.aps.motoapp.controle.MototaxiControle;
import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;
import br.ufc.crateus.aps.motoapp.controle.entidade.Corrida;
import br.ufc.crateus.aps.motoapp.controle.entidade.DadosBancarios;
import br.ufc.crateus.aps.motoapp.controle.entidade.Localizacao;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;
import br.ufc.crateus.aps.motoapp.padroes.factory.TipoSmartphone;
import br.ufc.crateus.aps.motoapp.padroes.observer.AreaDeRisco;

public class App {

	public static void main(String[] args) {
		ClienteControle rc=  ClienteControle.getInstancia();
		MototaxiControle mr = MototaxiControle.getInstancia();
		CorridaControle cr = CorridaControle.getInstancia();
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
		
		 
		rc. cadastrarCliente(c);

		mr.cadastrarMotoTaxi(m);
		
		
		 m = mr.autenticarMototaxi("mototaxi", "321");
		m.setLocalizacao(mr.obterLocalizacao());
		
		 c = rc.autenticarCliente("user", "123");
		 c.setLocalizacao(rc.obterLocalizacao());
		
		 ArrayList<Mototaxi> motos = mr.obterMototaxi(c, 0);
		 
		 Corrida corridaPedida = cr.perdirCorrida(c, motos.get(0), new Localizacao(2.0, 5.0), "Cartao");
		
		 ArrayList<Corrida> corridas = cr.consultarMinhasCorridas(m);
		
		 cr.confirmarCorrida(corridaPedida);
		 
		 Mototaxi m2 = new Mototaxi();
		 m2.setCNH("123");
		 m2.setSmartphone(TipoSmartphone.Android);
		 
		 AreaDeRisco n = new AreaDeRisco();
		 n.addListener(m);
		 n.addListener(c);
		 n.addListener(m2);
		 n.dispararnotificacao();
		 
		
		
	}
}
