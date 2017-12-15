package br.ufc.crateus.aps.motoapp.padroes.factory;

public class SmartphoneFactory {
	
	public Smartphone getSmatphone(TipoSmartphone tipo){
		switch (tipo) {
		case IOS:
			return new SmartphoneIOS();
		case Android:
			return new SmartphoneAndroid();
		default:
			break;
		}
		return null;
	}

}
