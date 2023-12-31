package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor()
				.multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprovar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Aprovado());
	}

	@Override
	public void reprovar(Orcamento orcamento) {
		orcamento.setSituacaoOrcamento(new Reprovado());
	}

}
