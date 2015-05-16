package br.com.decorator;

public class YogurtComCastanha extends YogurtDecorator {
	private String produtos;
	private double preco;
	
	public YogurtComCastanha(Yogurt yogurt) {
		super(yogurt);
		produtos = "Castanha";
		preco = 1.0;
	}

	public double getPreco() {
		return super.getPreco() + preco;
	}

	public String getProdutos() {
		return super.getProdutos() + " + " + produtos;
	}
}
