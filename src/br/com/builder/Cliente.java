package br.com.builder;public class Cliente {	private FuncionarioMontador montador = new FuncionarioMontador();	public void pedir(String sanduiche, String batata, String brinquedo, String refrigerante) {		Atendente atendente = new Atendente(montador);		atendente.efetuarPedido(sanduiche, batata, brinquedo, refrigerante);		Pedido pedido = montador.getPedido();		System.out.println(pedido);	}}