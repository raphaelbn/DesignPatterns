package br.com.singleton;

public class Logger {
	private static Logger ex;
	private boolean ativo = false;
	
	private Logger() {}
	
	public boolean isAtivo() {
		return this.ativo;
	}
	public void setAtivo(boolean b) {
			this.ativo = b;
	}
	public static Logger getInstancia()
	{
		if(ex == null) 
			ex = new Logger();	
		return ex;
	}
	public void log(String s) { 
		System.out.println("LOG :: " + s);
	}

}
