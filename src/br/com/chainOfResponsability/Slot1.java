package br.com.chainOfResponsability;

public class Slot1 extends SlotsChain {
	
	public double coin;
	
	public Slot1(double c) {
		super(c);
		coin = c;
	}

	public double computeCoin(double val) {
		return val-0.01;
	}
}
