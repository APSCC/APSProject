package br.ufc.crateus.aps.motoapp.controle.entidade;

public class DadosBancarios {
	private int agencia;
	private int conta;
	private int digito;
	private int CodSeg;
	private int numero;
	
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	public int getCodSeg() {
		return CodSeg;
	}
	public void setCodSeg(int codSeg) {
		CodSeg = codSeg;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}

}
