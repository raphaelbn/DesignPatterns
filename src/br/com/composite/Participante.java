package br.com.composite;

public class Participante extends CongressoComponent {
	String nomeParticipante;
	
	public Participante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }
	
	public void printNomeParticipante() {
		System.out.println(this.nomeParticipante);
	}
	
	public String getNomeParticipante() {
        return this.nomeParticipante;
    }
}
