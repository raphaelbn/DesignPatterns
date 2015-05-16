package br.com.observer;

public class Teste {
	public static void main(String[] args) {
		// Cria os objetos.
		SensorConcreto sensor = new SensorConcreto();
		SensorConcreto sensor2 = new SensorConcreto();
		
		CiaSeguros observador1 = new CiaSeguros(sensor2);
		DelegaciaPolicia observador2 = new DelegaciaPolicia(sensor);
		
		sensor.alterarAlerta();
		sensor.alterarAlerta();
	}
}
