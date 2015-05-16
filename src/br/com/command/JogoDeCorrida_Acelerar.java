package br.com.command;

public class JogoDeCorrida_Acelerar implements CommandInterface{

	private JogoDeCorrida jogo;
	JogoDeCorrida_Acelerar(JogoDeCorrida jogo)
	{
		this.jogo = jogo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.jogo.acelerar();
	}
	
}
