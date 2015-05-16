package br.com.factoryMethod;

public class VisualizadorFactory {
	Visualizador v;
	public Visualizador getVisualizador(int tipo)
	{
		switch(tipo) {
			case 1:
				v = new VisualizadorJPG();
				break;
			case 2:
				v = new VisualizadorPNG();
				break;
			default:
		}
		return v;
	}
}
