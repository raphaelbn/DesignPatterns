package br.com.bridge;

public class ImplementadorNumero implements Implementador {

	private int numero = 1;
	@Override
	public void imprimirItens(String item) {
		System.out.println((numero++) + ". " + item);
	}

}
