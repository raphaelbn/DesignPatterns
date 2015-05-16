package br.com.observer;

import java.util.ArrayList;
import java.util.Iterator;

public class SensorConcreto implements Sensor{
	private boolean alerta = false;
	
	private ArrayList observadores = new ArrayList();
	
	public boolean alterarAlerta()
	{
		if(alerta)
			alerta = false;
		else{
			alerta = true;
		}
		notificarObservadores();
		return alerta;
	}
	
	public void notificarObservadores()
	{
		Iterator i = observadores.iterator();
		while(i.hasNext())
		{
			Observador o = (Observador) i.next();
			o.atualiza(this);
		}
	}
	
	public boolean getAlerta()
	{
		return alerta;
	}
	
	public void disparar() {
		System.out.println("Movimento detectado! Alertando sistema.\n");
	}

	@Override
	public void addObservador(Observador ob) {
		// TODO Auto-generated method stub
		observadores.add(ob);
	}

	@Override
	public void removeObservador(Observador ob) {
		// TODO Auto-generated method stub
		observadores.remove(ob);
	}
}
