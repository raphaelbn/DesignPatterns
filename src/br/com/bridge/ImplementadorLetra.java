package br.com.bridge;

public class ImplementadorLetra implements Implementador {
	
	private char letra = 'A';

	@Override
	public void imprimirItens(String item) {
		System.out.println((letra++) + ") " + item);
	}

}
