package br.ufc.crateus.aps.motoapp.controle.entidade;

import javax.swing.JOptionPane;

import br.ufc.crateus.aps.motoapp.padroes.factory.Smartphone;
import br.ufc.crateus.aps.motoapp.padroes.factory.SmartphoneFactory;
import br.ufc.crateus.aps.motoapp.padroes.observer.AreaDeRiscoListener;

public class Mototaxi extends Usuario implements AreaDeRiscoListener {
	
	private String CNH;
	private Moto moto;
	private boolean status;
	
	
	public String getCNH() {
		return CNH;
	}
	public void setCNH(String cNH) {
		CNH = cNH;
	}
	public Moto getMoto() {
		return moto;
	}
	public void setMoto(Moto moto) {
		this.moto = moto;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public void notificar() {
		JOptionPane.showMessageDialog(null, "Essa area é uma area de risco");
		Smartphone s = new SmartphoneFactory().getSmatphone(getSmartphone());
		 s.notificar("");
	}
	
	

	
}
