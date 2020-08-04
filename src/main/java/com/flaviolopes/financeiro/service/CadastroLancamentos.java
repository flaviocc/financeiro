package com.flaviolopes.financeiro.service;

import java.io.Serializable;
import java.util.Date;

import com.flaviolopes.financeiro.model.Lancamento;
import com.flaviolopes.financeiro.repository.Lancamentos;

public class CadastroLancamentos implements Serializable {

	private static final long serialVersionUID = 1L;

	private Lancamentos lancamentos;

	public CadastroLancamentos(Lancamentos lancamentos) {
		this.lancamentos = lancamentos;
	}
	
	public void salvar(Lancamento lancamento) throws NegocioException {
		if (lancamento.getDataPagamento() != null &&
				lancamento.getDataPagamento().after(new Date())) {
			throw new NegocioException("Data de pagamento não pode ser após uma data futura.");
		}
		this.lancamentos.adicionar(lancamento);
	}

}
