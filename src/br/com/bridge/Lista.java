package br.com.bridge;

public abstract class Lista {
	
	protected Implementador impressora;

	public Lista(Implementador impressora) {
		this.impressora = impressora;
	}
	
	public abstract void adicionar (String s);
	
	public abstract void imprimir ();
}
