package br.com.alura.loja.service;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.TipoImposto;

public class CalculadoraImpostosService {

	public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {

		switch (tipoImposto) {
		case ICMS:
			return orcamento.getValor()
					.multiply(new BigDecimal("0.1"));
		case ISS:
			return orcamento.getValor()
					.multiply(new BigDecimal("0.6"));
		default:
			return BigDecimal.ZERO;

		}

	}

}
