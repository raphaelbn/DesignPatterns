package br.com.memento;

public class Memento {
	protected String estado;

	public Memento(String texto) {
		estado = texto;
	}

	public String getTextoSalvo() {
		return estado;
	}
}
