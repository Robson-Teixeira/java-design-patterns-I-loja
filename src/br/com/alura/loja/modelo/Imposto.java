package br.com.alura.loja.modelo;

import java.math.BigDecimal;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
