package br.ufc.crateus.aps.motoapp.controle.entidade;

import br.ufc.crateus.aps.motoapp.padroes.factory.Smartphone;
import br.ufc.crateus.aps.motoapp.padroes.factory.SmartphoneFactory;
import br.ufc.crateus.aps.motoapp.padroes.factory.TipoSmartphone;

public abstract class Usuario {
	private String login;
	private String senha;
	private String nome;
	private String CPF;
	private TipoSmartphone smartphone;
	private String RG;
	private String telefone;
	private String dataNascimento;
	private DadosBancarios dadosBancarios;
	private String email;
	private Localizacao localizacao;
	
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	public TipoSmartphone getSmartphone() {
		return smartphone;
	}
	public void setSmartphone(TipoSmartphone smartphone) {
		this.smartphone = smartphone;
	}
	
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public DadosBancarios getDadosBancarios() {
		return dadosBancarios;
	}
	public void setDadosBancarios(DadosBancarios dadosBancarios) {
		this.dadosBancarios = dadosBancarios;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Localizacao getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
