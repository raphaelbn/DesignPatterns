package br.com.decorator;

public class Morango implements Yogurt{
	private String name = "Morango";
	private double preco = 3.0;

	public double getPreco() {
		return preco;
	}

	public String getProdutos() {
		return name;
	}
}
