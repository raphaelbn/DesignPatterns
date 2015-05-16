package br.com.composite;

import java.util.ArrayList;

public class ParticipanteComposite extends CongressoComponent {
	ArrayList<CongressoComponent> participantes = new ArrayList<CongressoComponent>();
	
	public ParticipanteComposite(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}

	@Override
	public void printNomeParticipante() {
		System.out.println(this.nomeParticipante);
		for (CongressoComponent participanteTmp : participantes) {
			participanteTmp.printNomeParticipante();
		}
	}

	@Override
	public String getNomeParticipante() {
        return this.nomeParticipante;
    }
	
	@Override
	public void adicionar(CongressoComponent novoParticipante) {
		this.participantes.add(novoParticipante);
	}

	@Override
	public void remover(String nomeParticipante) throws Exception {
		for (CongressoComponent participanteTmp : participantes) {
			if (participanteTmp.getNomeParticipante() == nomeParticipante) {
				this.participantes.remove(participanteTmp);
				return;
			}
		}
		throw new Exception("N?o existe este participante");
	}

	@Override
	public CongressoComponent getParticipante(String nomeParticipante) throws Exception {
		for (CongressoComponent participanteTmp : participantes) {
			System.out.println(participanteTmp.getNomeParticipante());
			if (participanteTmp.getNomeParticipante() == nomeParticipante) {
				return participanteTmp;
			}
		}
		throw new Exception("N?o existe este participante");
	}
}
