package br.ufc.crateus.aps.motoapp.padroes.factory;

public class SmartphoneAndroid implements Smartphone{
	@Override
	public void notificar(String mensagem) {
		System.out.println("notificar Android");
	}

}
