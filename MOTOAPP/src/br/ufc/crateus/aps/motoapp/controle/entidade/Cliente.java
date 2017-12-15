package br.ufc.crateus.aps.motoapp.controle.entidade;

import javax.swing.JOptionPane;

import br.ufc.crateus.aps.motoapp.padroes.factory.Smartphone;
import br.ufc.crateus.aps.motoapp.padroes.factory.SmartphoneFactory;
import br.ufc.crateus.aps.motoapp.padroes.observer.AreaDeRiscoListener;

public class Cliente extends Usuario implements AreaDeRiscoListener{

	@Override
	public void notificar() { 
	 Smartphone s = new SmartphoneFactory().getSmatphone(getSmartphone());
	 s.notificar("");
		JOptionPane.showMessageDialog(null, "A sua localixza��o � uma ara de risco. Voc� ser� taxado em 20%");
		
	}
	
	

}