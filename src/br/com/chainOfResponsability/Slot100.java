package br.com.chainOfResponsability;

public class Slot100 extends SlotsChain {

	public double coin;

	public Slot100(double c) {
		super(c);
		coin = c;
	}

	public double computeCoin(double val) {
		return val-1.0;
	}
}
