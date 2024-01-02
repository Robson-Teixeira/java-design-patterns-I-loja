package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private String situacao;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void aprovar() {
		this.situacao = "Aprovado";
	}

	public void aplicarDescontoExtra() {

		BigDecimal valorDescontoExtra = BigDecimal.ZERO;

		if (situacao.equals("Em Análise"))
			valorDescontoExtra = new BigDecimal("0.05");
		else if (situacao.equals("Aprovado"))
			valorDescontoExtra = new BigDecimal("0.02");

		this.valor = this.valor.subtract(valorDescontoExtra);

	}

}
