package br.com.command;

public class JogoDeFutebol_Correr implements CommandInterface{

	private JogoDeFutebol jogo;
	
	JogoDeFutebol_Correr(JogoDeFutebol jogo)
	{
		this.jogo = jogo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.jogo.correr();
	}

}
