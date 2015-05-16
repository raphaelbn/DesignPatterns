package br.com.decorator;

public class CoberturaCaramelo extends YogurtDecorator{
	private String produtos;
	private double preco;
	
	public CoberturaCaramelo(Yogurt y)
	{
		super(y);
		produtos = "Cobertura de Caramelo";
		preco = 1.5;
		
	}

	public double getPreco() {
		return super.getPreco() + preco;
	}

	public String getProdutos() {
		return super.getProdutos() + " + " + produtos;
	}
}
