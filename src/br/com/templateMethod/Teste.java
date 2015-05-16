package br.com.templateMethod;

public class Teste {
	public static void main(String[] args) throws Exception {
		FormatadorAbstrato manipulador;

		System.out.println("Transformando em maiusculo.");
		System.out.print("Digite seu texto: ");
		manipulador = new FormatadorMaiusculo();
		manipulador.manipularString();

		System.out.println("Transformando em minusculo.");
		System.out.print("Digite seu texto: ");
		manipulador = new FormatadorMinusculo();
		manipulador.manipularString();

		System.out.println("Duplicando.");
		System.out.print("Digite seu texto: ");
		manipulador = new FormatadorDuplicar();
		manipulador.manipularString();

		System.out.println("Invertendo.");
		System.out.print("Digite seu texto: ");
		manipulador = new FormatadorInverter();
		manipulador.manipularString();
	}
}
