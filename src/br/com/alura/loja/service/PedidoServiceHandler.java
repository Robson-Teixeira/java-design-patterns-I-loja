package br.com.alura.loja.service;

import java.time.LocalDateTime;

import br.com.alura.loja.modelo.Orcamento;
import br.com.alura.loja.modelo.Pedido;

public class PedidoServiceHandler {

	// Incluir construtor com injeção de dependências: repositório, serviço e etc

	public void executa(PedidoService pedidoService) {

		Orcamento orcamento = new Orcamento(
				pedidoService.getValorOrcamento(), pedidoService.getQuantidadeItens());

		Pedido pedido = new Pedido(
				pedidoService.getCliente(), LocalDateTime.now(), orcamento);

		System.out.println("Salvar pedido");
		System.out.println("Enviar e-mail com dados do pedido");

		EmailService emailService = new EmailService();

		emailService.executar(pedido);
		pedidoService.salvar(pedido);

	}

}
