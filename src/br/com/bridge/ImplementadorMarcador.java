package br.com.bridge;

public class ImplementadorMarcador implements Implementador {

	private char marcador = '*';
	@Override
	public void imprimirItens(String item) {
		System.out.println(marcador + " " + item);
		
	}

}
