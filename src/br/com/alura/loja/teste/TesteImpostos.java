package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.TipoImposto;
import br.com.alura.loja.service.CalculadoraImpostosService;

public class TesteImpostos {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("100"));
		CalculadoraImpostosService calculadoraImpostosService = new CalculadoraImpostosService();

		System.out.println("Imposto: " + calculadoraImpostosService
				.calcular(orcamento, TipoImposto.ICMS));

	}

}
