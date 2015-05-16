package br.com.composite;

public class Teste {

	public static void main(String[] args) throws Exception {
		CongressoComponent instituicao = new ParticipanteComposite("UECE");
		CongressoComponent participante1 = new Participante("Rodrigo");
		CongressoComponent participante2 = new Participante("Raphael");
		CongressoComponent participante3 = new Participante("PH");
	 
	    try {
	    	instituicao.printNomeParticipante();
	    	System.out.println();
	    	
	    	instituicao.adicionar(participante1);
	    	instituicao.adicionar(participante2);
	    	instituicao.printNomeParticipante();
	    	System.out.println();
	    	
	    	instituicao.adicionar(participante3);
	    	instituicao.printNomeParticipante();
	    	System.out.println();
	    	
	    	instituicao.remover("PH");
	    	instituicao.printNomeParticipante();
	    	System.out.println();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }

	}

}
