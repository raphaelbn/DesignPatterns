package br.com.composite;

public abstract class CongressoComponent {
	String nomeParticipante;
	
	public void printNomeParticipante() {
        System.out.println(this.nomeParticipante);
    }
 
    public String getNomeParticipante() {
        return this.nomeParticipante;
    }
 
    public void adicionar(CongressoComponent novoParticipante) throws Exception {
        throw new Exception("N?o pode inserir participantes em: " + this.nomeParticipante + " - N?o ? um congresso");
    }
 
    public void remover(String nomeDoParticipante) throws Exception {
        throw new Exception("N?o pode remover participantes em: " + this.nomeParticipante + " -N?o ? um congresso");
    }
 
    public CongressoComponent getParticipante(String nomeParticipante) throws Exception {
    	throw new Exception("N?o pode pesquisar participantes em: " + this.nomeParticipante + " - N?o ? um congresso");
    }
}
