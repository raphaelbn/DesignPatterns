package br.com.command;

public class JogoDeCorrida_Freiar implements CommandInterface{

	private JogoDeCorrida jogo;
	JogoDeCorrida_Freiar(JogoDeCorrida jogo)
	{
		this.jogo = jogo;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.jogo.freiar();
	}
}
