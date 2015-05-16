package br.com.observer;

public class CiaSeguros implements Observador {

	private SensorConcreto observado;
	
	public CiaSeguros(SensorConcreto s)
	{
		this.observado = s;
		observado.addObservador(this);
	}
	@Override
	public void atualiza(Sensor sensor) {
		// TODO Auto-generated method stub
		if(sensor == observado)
			System.out.println("A sirene para Cia de Seguros mudou seu estado para " + observado.getAlerta());
	}
}
