package br.com.strategy;

public class Aplicacao {
	private LoggerAbstract estrategiaLogger;
	
	public void escolherEstrategia(int escolha)
	{
		switch(escolha)
		{
		case 1:	
			estrategiaLogger = new LoggerDatabase();
			break;
		case 2: 
			estrategiaLogger = new LoggerEventViewer();
			break;
		case 3: 
			estrategiaLogger = new LoggerFile();
			break;
		default:
			System.out.println("Estrategia inexistente!");
		}
		estrategiaLogger.imprimeLog();
	}
}
