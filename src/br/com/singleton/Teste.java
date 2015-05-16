package br.com.singleton;

public class Teste {

	public static void main(String[] args) {
		Logger log1 = Logger.getInstancia();
		log1.setAtivo(true);
		log1.log("PRIMEIRA MENSAGEM DE LOG");
		Logger log2 = Logger.getInstancia();
		log2.log("SEGUNDA MENSAGEM DE LOG");
	}
}