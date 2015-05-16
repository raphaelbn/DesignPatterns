package br.com.decorator;

public class Banana implements Yogurt{
	private String name = "Banana";
	private double preco = 3.5;

	public double getPreco() {
		return preco;
	}

	public String getProdutos() {
		return name;
	}
}
