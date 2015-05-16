package br.com.decorator;

public class YogurtComKitKat extends YogurtDecorator{
	private String produtos;
	private double preco;
	
	public YogurtComKitKat(Yogurt y)
	{
		super(y);
		produtos = "KitKat";
		preco = 2.0;
		
	}

	public double getPreco() {
		return super.getPreco() + preco;
	}
	
	public String getProdutos() {
		return super.getProdutos() + " + " + produtos;
	}
}
