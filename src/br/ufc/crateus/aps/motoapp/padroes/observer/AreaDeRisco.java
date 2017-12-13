package br.ufc.crateus.aps.motoapp.padroes.observer;

import java.util.ArrayList;
import java.util.List;


public class AreaDeRisco {
	
	private List<AreaDeRiscoListener> listeners = new ArrayList<AreaDeRiscoListener>();
	
	public void addListener(AreaDeRiscoListener listener) {
		listeners.add(listener);
	}
	
	public void dispararnotificacao() {
		for (AreaDeRiscoListener listener : listeners) {
			listener.notificar();
		}
	}
	
}
