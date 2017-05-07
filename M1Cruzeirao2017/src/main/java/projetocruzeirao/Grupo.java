package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	
	private String nome;
	private Fase fase;
	private List<Rodada> rodadas;
	private int numero;
	
	public Grupo(){
		rodadas = new ArrayList<Rodada>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Rodada> getRodadas() {
		return rodadas;
	}
	
	public void setRodada(Rodada r){
		rodadas.add(r);
	}

}
