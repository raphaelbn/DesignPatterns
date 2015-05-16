package br.com.command;

public class Teste {

	private String nome;
	private String time;
	JoyStick joyStick = new JoyStick();
	
	Teste(String nome, String time)
	{
		this.nome = nome;
		this.time = time;
	}
	
	public static void main(String[] args)
	{
		Teste raphael = new Teste("Raphael","Fortaleza");
		JogoDeFutebol jogo = new JogoDeFutebol();
		
		JogoDeFutebol_Correr correr = new JogoDeFutebol_Correr(jogo);
		JogoDeFutebol_Tocar tocar = new JogoDeFutebol_Tocar(jogo);
		
		System.out.println("Eh dada a partida, amigos da Rede Globo...");
		raphael.joyStick.setCommandFutebol(0, tocar);
		raphael.joyStick.setCommandFutebol(1, correr);
		
		raphael.joyStick.commandAFutebol();
		raphael.joyStick.commandBFutebol();
		raphael.joyStick.commandAFutebol();
		raphael.joyStick.commandBFutebol();
		raphael.joyStick.commandAFutebol();
		raphael.joyStick.commandBFutebol();
	}
}
