package br.ufc.crateus.aps.motoapp.controle;

import java.util.ArrayList;

import br.ufc.crateus.aps.motoapp.android.LocationAPI;
import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;
import br.ufc.crateus.aps.motoapp.controle.entidade.Corrida;
import br.ufc.crateus.aps.motoapp.controle.entidade.Localizacao;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioCorrida;

public class CorridaControle {
	
	 public static CorridaControle instancia;	 
	    
	LocationAPI lapi = new LocationAPI();
	RepositorioCorrida rc = new RepositorioCorrida();

	public Corrida perdirCorrida(Cliente c, Mototaxi m, Localizacao destino, String formaPagamento) {
		
		
		return new Corrida(c, m, c.getLocalizacao(), destino, formaPagamento);
	}
	
	public boolean cadastrarCorrida(Corrida co) {
		try {
			rc.addCorrida(co);
			return true;
		} catch (Exception e) {
			System.out.println("A corrida não pode ser cadastrada");
			return false;
		}
		
	}
	
	public ArrayList<Corrida> consultarMinhasCorridas(Mototaxi m){
		ArrayList<Corrida> corridas = new ArrayList<>();
		for (Corrida co : rc.getAllCorridas()) {
			if ((co.getMotoTaxi().equals(m)))
				corridas.add(co);
		}
		
		return corridas;
	}
	
	public String confirmarCorrida(Corrida co) {
		cadastrarCorrida(co);
		return "Corrida confirmada pelo mototaxi. Aguarde!";
	}
	
	   public static CorridaControle getInstancia() {
	        if (instancia == null)
	            instancia = new CorridaControle();
	        return instancia;
	    }
	
}
