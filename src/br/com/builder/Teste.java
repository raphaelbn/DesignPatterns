package br.com.builder;public class Teste {	public static void main(String[] args) {		Cliente cliente = new Cliente();		cliente.pedir("hamburguer", "batata grande", "bonequinha", "guarana");		cliente = new Cliente();		cliente.pedir("cheeseburger", "batata media", "carrinho", "cola-cola");	}}