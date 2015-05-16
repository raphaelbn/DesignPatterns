package br.com.memento;

public class Operacoes {
	protected String texto;
	CareTaker caretaker;

	public Operacoes() {
		caretaker = new CareTaker();
		texto = new String();
	}

	public void escreverTexto(String novoTexto) {
		caretaker.adicionarMemento(new Memento(texto));
		texto += novoTexto;
	}

	public void desfazerEscrita() {
		texto = caretaker.getUltimoEstadoSalvo().getTextoSalvo();
	}

	public void mostrarTexto() {
		System.out.println(texto);
	}
}
