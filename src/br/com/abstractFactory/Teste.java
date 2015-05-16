package br.com.abstractFactory;

public class Teste {

	public static void main(String[] args) {
		int dia=2; /* Escolhe o dia da semana */
		Pizzaria a = new SegQuaSexPizzaria();
		Pizzaria b = new TerQuiSabPizzaria();

		if( (dia%2) == 0) {
			PizzaCalabresa pizzaCalabresa = a.fazPizzaCalabresa();
			pizzaCalabresa.exibirIngredientes();
		} else {
			if(dia == 1) {
				System.out.println("Pizzaria fechada!");
			} else {
				PizzaPresunto pizzaPresunto = b.fazPizzaPresunto();
				pizzaPresunto.exibirIngredientes();
			}
		}
	}

}
