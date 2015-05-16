package br.com.chainOfResponsability;

public class Slot25 extends SlotsChain {

	public double coin;

	public Slot25(double c) {
		super(c);
		coin = c;
	}

	public double computeCoin(double val) {
		return val-0.25;
	}
}
