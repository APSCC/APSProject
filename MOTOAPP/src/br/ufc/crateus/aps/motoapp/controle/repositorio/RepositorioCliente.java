package br.ufc.crateus.aps.motoapp.controle.repositorio;

import java.util.ArrayList;

import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;

public class RepositorioCliente {

	private static ArrayList<Cliente> repositorioCliente = new ArrayList<>();
	
	public boolean addCliente(Cliente c){
		repositorioCliente.add(c);
		return true;
	}
	
	public Cliente getCliente(int i){
		return repositorioCliente.get(i);
	}
	
	public ArrayList<Cliente> getAllClientes(){
		return repositorioCliente;
	}
	
	public boolean removeCliente(Cliente c){		
		return repositorioCliente.remove(c);
	}
	
	public int getSize(){
		return repositorioCliente.size();
	}

	public void clearAllClientes() {
		repositorioCliente.clear();
		
	}
	
}
