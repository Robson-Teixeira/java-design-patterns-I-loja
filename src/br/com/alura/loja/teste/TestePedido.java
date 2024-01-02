package br.com.alura.loja.teste;

import java.math.BigDecimal;

import br.com.alura.loja.service.PedidoService;
import br.com.alura.loja.service.PedidoServiceHandler;

public class TestePedido {

	public static void main(String[] args) {

		String cliente = args[0];
		BigDecimal valorOrcamento = new BigDecimal(args[1]);
		int quantidadeItens = Integer.parseInt(args[2]);

		PedidoService pedidoService = new PedidoService(
				cliente, valorOrcamento, quantidadeItens);

		PedidoServiceHandler pedidoServiceHandler = new PedidoServiceHandler();
		pedidoServiceHandler.executa(pedidoService);

	}

}
