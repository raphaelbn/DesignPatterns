package br.com.memento;

public class Teste {

	public static void main(String[] args) {
		Operacoes op = new Operacoes();
		op.escreverTexto("4");
		op.mostrarTexto();

		op.escreverTexto(" + 85");
		op.mostrarTexto();

		op.escreverTexto(" - 30");
		op.mostrarTexto();

		op.desfazerEscrita();
		op.mostrarTexto();

		op.desfazerEscrita();
		op.mostrarTexto();

		op.desfazerEscrita();
		op.mostrarTexto();

		op.desfazerEscrita();
		op.mostrarTexto();
	}

}
