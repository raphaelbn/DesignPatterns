package br.com.bridge;

public class Teste {

	public static void main(String[] args) {
		Lista lista = new ListaOrdenada(new ImplementadorNumero());
		lista.adicionar("Primeiro");
		lista.adicionar("Segundo");
		lista.imprimir();

		System.out.println();

		lista = new ListaNaoOrdenada(new ImplementadorLetra());
		lista.adicionar("Primeiro");
		lista.adicionar("Segundo");
		lista.imprimir();

		System.out.println();

		lista = new ListaNaoOrdenada(new ImplementadorMarcador());
		lista.adicionar("Primeiro");
		lista.adicionar("Segundo");
		lista.imprimir();
	}
}
