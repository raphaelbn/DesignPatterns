package br.com.decorator;

public abstract class YogurtDecorator implements Yogurt{
	protected Yogurt yogurtDecorado;

	public YogurtDecorator(Yogurt y)
	{
		this.yogurtDecorado = y;
	}

	public String getProdutos()
	{
		return yogurtDecorado.getProdutos();
	}

	public double getPreco()
	{
		return yogurtDecorado.getPreco();
	}
}
