package br.com.alura.loja.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.Pedido;

public class PedidoService {

	private String cliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;

	public PedidoService(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
		this.cliente = cliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}

	public void executa() {

		Orcamento orcamento = new Orcamento(
				this.valorOrcamento, this.quantidadeItens);

		Pedido pedido = new Pedido(
				this.cliente, LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido");
		System.out.println("Enviar e-mail com dados do pedido");

	}

}
