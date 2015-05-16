package br.com.decorator;

public class Teste {

	public static void main(String[] args) {
		Yogurt y = new Banana();
		System.out.println("Produto:" + y.getProdutos());
		System.out.println("Preco:" + y.getPreco());
		
		y = new YogurtComCastanha(y);
		System.out.println("Produto:" + y.getProdutos());
		System.out.println("Preco:" + y.getPreco());
		
		y = new CoberturaChocolate(y);
		System.out.println("Produto:" + y.getProdutos());
		System.out.println("Preco:" + y.getPreco());
	}

}
