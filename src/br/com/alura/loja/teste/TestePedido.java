package br.com.alura.loja.teste;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.Pedido;

public class TestePedido {

	public static void main(String[] args) {

		Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
		Pedido pedido = new Pedido("Robson Teixeira", LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido");
		System.out.println("Enviar e-mail com dados do pedido");

	}

}
