package br.ufc.crateus.aps.motoapp.controle.entidade;

public class Corrida {
	private int idCorrida;
	private Cliente cliente;
	private Mototaxi motoTaxi;
	private Localizacao origem;
	private Localizacao destino;
	private String formaPagamento;



	public Corrida(Cliente cliente, Mototaxi motoTaxi, Localizacao origem, Localizacao destino, String formaPagamento) {
		super();
		this.cliente = cliente;
		this.motoTaxi = motoTaxi;
		this.origem = origem;
		this.destino = destino;
		this.formaPagamento = formaPagamento;
	}

	public int getIdCorrida() {
		return idCorrida;
	}

	public void setIdCorrida(int idCorrida) {
		this.idCorrida = idCorrida;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Mototaxi getMotoTaxi() {
		return motoTaxi;
	}

	public void setMotoTaxi(Mototaxi motoTaxi) {
		this.motoTaxi = motoTaxi;
	}

	public Localizacao getOrigem() {
		return origem;
	}

	public void setOrigem(Localizacao origem) {
		this.origem = origem;
	}

	public Localizacao getDestino() {
		return destino;
	}

	public void setDestino(Localizacao destino) {
		this.destino = destino;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

}
