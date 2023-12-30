package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public class DescontoZero extends Desconto {

	public DescontoZero() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {

		return BigDecimal.ZERO;

	}

}
