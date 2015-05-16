package br.com.chainOfResponsability;

public abstract class SlotsChain {
	protected SlotsChain next;
	protected double coin;

	public SlotsChain(double c) {
		next = null;
		coin = c;
	}

	public void setNext(SlotsChain n) {
		if(next == null)
			next = n;
		else
			next.setNext(n);
	}

	public double insertCoin(double c, double val) throws Exception {
		double value;
		if(canReceiveCoin(c)) {
			value = computeCoin(val); 
		} else {
			if(next == null) throw new Exception("Slot nao existe!");
			value = next.insertCoin(c, val);
		}
		return value;
	}

	private boolean canReceiveCoin(double c) {
		if(this.coin == c) return true;
		return false;
	}

	protected abstract double computeCoin(double val);
}
