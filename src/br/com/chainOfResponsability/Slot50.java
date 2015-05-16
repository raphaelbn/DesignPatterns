package br.com.chainOfResponsability;

public class Slot50 extends SlotsChain {

	public double coin;

	public Slot50(double c) {
		super(c);
		coin = c;
	}

	public double computeCoin(double val) {
		return val-0.5;
	}
}
