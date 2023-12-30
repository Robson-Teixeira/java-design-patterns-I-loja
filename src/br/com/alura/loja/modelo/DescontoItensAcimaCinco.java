package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class DescontoItensAcimaCinco extends Desconto {

	public DescontoItensAcimaCinco(Desconto proximo) {
		super(proximo);
	}

	public BigDecimal calcular(Orcamento orcamento) {

		if (orcamento.getQuantidadeItens() > 5)
			return orcamento.getValor()
					.multiply(new BigDecimal("0.1"));

		return proximo.calcular(orcamento);

	}

}
