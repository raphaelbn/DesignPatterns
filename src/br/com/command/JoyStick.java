package br.com.command;

public class JoyStick {

	private CommandInterface[] jogoCorrida;
	private CommandInterface[] jogoFutebol;
	private CommandInterface[] jogoLuta;
	
	private static int quantidadeComandos = 2;
	
	JoyStick()
	{
		jogoCorrida = new CommandInterface[quantidadeComandos];
		jogoFutebol = new CommandInterface[quantidadeComandos];
		jogoLuta = new CommandInterface[quantidadeComandos];
		
		Command command = new Command();
		for(int i = 0; i < quantidadeComandos; i++)
		{
			jogoCorrida[i] = command;
			jogoFutebol[i] = command;
			jogoLuta[i] = command;
		}
	}
	
	void setCommandCorrida(int elemento, CommandInterface jogoCorrida)
	{
		this.jogoCorrida[elemento] = jogoCorrida;
	}
	
	void setCommandFutebol(int elemento, CommandInterface jogoFutebol)
	{
		this.jogoFutebol[elemento] = jogoFutebol;
	}
	
	void setCommandLuta(int elemento, CommandInterface jogoLuta)
	{
		this.jogoLuta[elemento] = jogoLuta;
	}
	
	public void commandACorrida()
	{
		this.jogoCorrida[0].execute();
	}
	
	public void commandAFutebol()
	{
		this.jogoFutebol[0].execute();
	}
	
	public void commandALuta()
	{
		this.jogoLuta[0].execute();
	}
	
	public void commandBCorrida()
	{
		this.jogoCorrida[1].execute();
	}
	
	public void commandBFutebol()
	{
		this.jogoFutebol[1].execute();
	}
	
	public void commandBLuta()
	{
		this.jogoLuta[1].execute();
	}
}
