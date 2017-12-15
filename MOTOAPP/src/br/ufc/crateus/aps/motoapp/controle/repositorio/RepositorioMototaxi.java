package br.ufc.crateus.aps.motoapp.controle.repositorio;

import java.util.ArrayList;

import br.ufc.crateus.aps.motoapp.controle.entidade.Localizacao;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;


public class RepositorioMototaxi {

private static ArrayList<Mototaxi> repositorioMototaxi = new ArrayList<>();
	
	public boolean addMototaxi(Mototaxi m){
		repositorioMototaxi.add(m);
		return true;
	}
	
	public Mototaxi getMototaxi(int i){
		return repositorioMototaxi.get(i);
	}
	
	public ArrayList<Mototaxi> getAllMototaxis(){
		return repositorioMototaxi;
	}
	
	public boolean removeMototaxi(Mototaxi m){		
		return repositorioMototaxi.remove(m);
	}
	
	public int getSize(){
		return repositorioMototaxi.size();
	}

	public void clearAllMototaxis() {
		repositorioMototaxi.clear();
		
	}
	
	
	
}
