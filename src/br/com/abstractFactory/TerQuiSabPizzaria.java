package br.com.abstractFactory;

public class TerQuiSabPizzaria implements Pizzaria {
	
	public PizzaCalabresa fazPizzaCalabresa() {
		return new PizzaCalabresa();
	}

	public PizzaPresunto fazPizzaPresunto() {
		return new PizzaPresunto();
	}
}
