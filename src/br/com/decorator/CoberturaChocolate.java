package br.com.decorator;

public class CoberturaChocolate extends YogurtDecorator{
	private String produtos;
	private double preco;
	
	public CoberturaChocolate(Yogurt y)
	{
		super(y);
		produtos = "Cobertura de Chocolate";
		preco = 1.0;
		
	}

	public double getPreco() {
		return super.getPreco() + preco;
	}

	public String getProdutos() {
		return super.getProdutos() + " + " + produtos;
	}	
}