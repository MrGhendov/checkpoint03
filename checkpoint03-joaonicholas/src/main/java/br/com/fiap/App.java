package br.com.fiap;

import br.com.fiap.service.impl.PedidoServiceImpl;
import br.com.fiap.service.impl.ProdutoServiceImpl;

public class App {
	
	public static void main(String[] args) {
		
		PedidoServiceImpl pedidoService = PedidoServiceImpl.getInstance();
		ProdutoServiceImpl produtoService = ProdutoServiceImpl.getInstance();
		
		System.out.println("============ Listar pedidos com cpf ==============");
		
		pedidoService.listarPorCPF("111.111.111-11").forEach(System.out::println);
		
		System.out.println("============ Listar produtos por valor ==============");
		
		produtoService.listarPorValor(100).forEach(System.out::println);
	}

}
