package br.com.factoryMethod;

public class Teste {
	
	public static void main(String[] args) {
		Visualizador vi;
		VisualizadorFactory viFactory = new VisualizadorFactory();
		vi = viFactory.getVisualizador(2);
		vi.visualizar();
	}
}
