package br.com.command;

public class JogoDeFutebol_Tocar implements CommandInterface{

	private JogoDeFutebol jogo;
	
	JogoDeFutebol_Tocar(JogoDeFutebol jogo)
	{
		this.jogo = jogo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.jogo.tocaBola();
	}

}
