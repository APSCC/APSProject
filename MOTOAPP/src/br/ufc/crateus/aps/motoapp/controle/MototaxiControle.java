package br.ufc.crateus.aps.motoapp.controle;

import java.util.ArrayList;

import br.ufc.crateus.aps.motoapp.android.LocationAPI;
import br.ufc.crateus.aps.motoapp.controle.entidade.Cliente;
import br.ufc.crateus.aps.motoapp.controle.entidade.Localizacao;
import br.ufc.crateus.aps.motoapp.controle.entidade.Moto;
import br.ufc.crateus.aps.motoapp.controle.entidade.Mototaxi;
import br.ufc.crateus.aps.motoapp.controle.repositorio.RepositorioMototaxi;
import br.ufc.crateus.aps.motoapp.padroes.observer.AreaDeRisco;

public class MototaxiControle {
	
	 public static MototaxiControle instancia;
	 
 RepositorioMototaxi rm = new RepositorioMototaxi();
 LocationAPI lapi = new LocationAPI();
	
	public Localizacao obterLocalizacao() {

		return lapi.getLocalizacao();
	}

	public boolean cadastrarMotoTaxi(Mototaxi m) {
		
		if(rm.addMototaxi(m)){
			System.out.println("Mototaxi inserido com sucesso!");
			return true;
		}else {
			System.out.println("Não foi possivel cadastrar o mototaxi!");
			return false;
		}
		
	}
	
	public Mototaxi autenticarMototaxi(String login, String senha) {
		for(int i=0; i < rm.getSize(); i++) {
			if(rm.getMototaxi(i).getLogin().equals(login)) {
				if(rm.getMototaxi(i).getSenha().equals(senha)) {
					return rm.getMototaxi(i);
				}
				else {
					System.out.println("Senha invalida!");
				}
			}else {
				System.out.println("Login e senha estão invalidos!");
			}
		}
		
		
		return null;
	}
	
	public ArrayList<Mototaxi> obterMototaxi(Cliente cli, int raio) {
		ArrayList<Mototaxi> mts = new ArrayList<>();

		for (Mototaxi m : rm.getAllMototaxis()) {
			if ((cli.getLocalizacao().getLatitude() + raio) <= m.getLocalizacao().getLatitude())
				mts.add(m);
		}

		return mts;
	}
	
	
	public ArrayList<Mototaxi> consultarMototaxis() {
		ArrayList<Mototaxi> mototaxis = new ArrayList<>();
		for (Mototaxi m : rm.getAllMototaxis()) {
			mototaxis.add(m);
		}

		return mototaxis;
	}
	
	public void alertarArea(Mototaxi m) {
		AreaDeRisco n = new AreaDeRisco();
		n.addListener(m);
		n.dispararnotificacao();
	}


    public static MototaxiControle getInstancia() {
        if (instancia == null)
            instancia = new MototaxiControle();
        return instancia;
    }
}
