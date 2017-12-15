package br.ufc.crateus.aps.motoapp.controle.repositorio;

import java.util.ArrayList;

import br.ufc.crateus.aps.motoapp.controle.entidade.Corrida;

public class RepositorioCorrida {

private static ArrayList<Corrida> repositorioCorrida = new ArrayList<>();
	
	public void addCorrida(Corrida c){
		repositorioCorrida.add(c);
	}
	
	public Corrida getCorrida(int i){
		return repositorioCorrida.get(i);
	}
	
	public ArrayList<Corrida> getAllCorridas(){
		return repositorioCorrida;
	}
	
	public boolean removeCorrida(Corrida c){		
		return repositorioCorrida.remove(c);
	}
	
	public int getSize(){
		return repositorioCorrida.size();
	}

	public void clearAllCorridas() {
		repositorioCorrida.clear();
		
	}
}
