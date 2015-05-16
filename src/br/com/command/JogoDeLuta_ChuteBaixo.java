package br.com.command;

public class JogoDeLuta_ChuteBaixo implements CommandInterface{

	JogoDeLuta jogo;
	
	JogoDeLuta_ChuteBaixo(JogoDeLuta jogo)
	{
		this.jogo = jogo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.jogo.chuteBaixa();
	}
}
