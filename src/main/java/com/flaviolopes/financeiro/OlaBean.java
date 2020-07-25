package com.flaviolopes.financeiro;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class OlaBean {

	private String nome;
	private String sobreNome;
	private String nomeCompleto;

	public void dizerOla() {
		this.nomeCompleto = this.nome.toUpperCase() + " " + this.sobreNome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	public String getNomeCompleto() {
		return nomeCompleto;
	}

}
