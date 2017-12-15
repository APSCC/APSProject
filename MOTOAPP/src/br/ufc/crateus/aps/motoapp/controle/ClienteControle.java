package br.ufc.crateus.aps.motoapp.controle;

import java.util.ArrayList;

import br.ufc.crateus.aps.motoapp.android.LocationAPI;
import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;
import br.ufc.crateus.aps.motoapp.controle.entidade.Corrida;
import br.ufc.crateus.aps.motoapp.controle.entidade.Localizacao;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioCliente;

public class ClienteControle {

	public static ClienteControle instancia;

	RepositorioCliente rc = new RepositorioCliente();
	LocationAPI lapi = new LocationAPI();

	public Localizacao obterLocalizacao() {

		return lapi.getLocalizacao();
	}

	public boolean cadastrarCliente(Cliente c) {

		if (rc.addCliente(c)) {
			System.out.println("Cliente inserido com sucesso!");
			return true;
		} else {
			System.out.println("Não foi possivel cadastrar o cliente!");
			return false;
		}

	}

	public Cliente autenticarCliente(String login, String senha) {
		for (int i = 0; i < rc.getSize(); i++) {
			if (rc.getCliente(i).getLogin().equals(login)) {
				if (rc.getCliente(i).getSenha().equals(senha)) {
					return rc.getCliente(i);
				} else {
					System.out.println("Senha invalida!");
				}
			} else {
				System.out.println("Login e senha estão invalidos!");
			}
		}

		return null;
	}

	public ArrayList<Cliente> consultarClientes() {
		ArrayList<Cliente> clientes = new ArrayList<>();
		for (Cliente c : rc.getAllClientes()) {
			clientes.add(c);
		}

		return clientes;
	}

	public static ClienteControle getInstancia() {
		if (instancia == null)
			instancia = new ClienteControle();
		return instancia;
	}
}
