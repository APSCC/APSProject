package br.ufc.crateus.aps.motoapp.padroes.factory;

public class SmartphoneIOS implements Smartphone{

	@Override
	public void notificar(String mensagem) {
		System.out.println("notificar IOS");
	}
}
