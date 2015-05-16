package br.com.decorator;

public class Chocolate implements Yogurt{
	private String name = "Chocolate";
	private double preco = 4.0;
	
	public double getPreco() {
		return preco;
	}

	public String getProdutos() {
		return name;
	}
}
