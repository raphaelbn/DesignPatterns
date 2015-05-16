package br.com.bridge;

import java.util.ArrayList;

public class ListaNaoOrdenada extends Lista {

	private ArrayList<String> lista = new ArrayList<String>();
	
	public ListaNaoOrdenada(Implementador impressora) {
		super(impressora);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void adicionar(String item) {
		lista.add(item);
	}

	@Override
	public void imprimir() {
		for(String item : lista)
			impressora.imprimirItens(item);
	}

}
