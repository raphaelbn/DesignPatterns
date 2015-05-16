package br.com.observer;

public class DelegaciaPolicia implements Observador {

	private SensorConcreto observado;
	
	public DelegaciaPolicia(SensorConcreto s)
	{
		this.observado = s;
		observado.addObservador(this);
	}
	
	@Override
	public void atualiza(Sensor sensor) {
		// TODO Auto-generated method stub
		if(sensor == observado)
			System.out.println("A sirene para Delegacia de Policia mudou seu estado para " + observado.getAlerta());
	}
}
