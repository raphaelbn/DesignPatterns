package br.com.chainOfResponsability;

public class Teste {

	public static void main(String[] args) throws Exception {
		SlotsChain slots = new Slot1(0.01);
		slots.setNext(new Slot25(0.25));
		slots.setNext(new Slot50(0.5));
		slots.setNext(new Slot100(1.0));
		
		double val = 2.50;

		val = slots.insertCoin(1.0, val);
		System.out.println(val);
		
		val = slots.insertCoin(0.01, val);
		System.out.println(val);

		val = slots.insertCoin(1.0, val);
		System.out.println(val);
		
		val = slots.insertCoin(1.0, val);
		if(val < 0) {
			System.out.println("Pagamento Efetuado!!! Troco: "+Math.abs(val));
		}
		
	}
}

