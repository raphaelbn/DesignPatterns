package br.com.command;

public class JogoDeLuta_ChuteAlto implements CommandInterface{

	private JogoDeLuta jogo;
	
	JogoDeLuta_ChuteAlto(JogoDeLuta jogo)
	{
		this.jogo = jogo;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.jogo.chuteAlto();
	}
}
