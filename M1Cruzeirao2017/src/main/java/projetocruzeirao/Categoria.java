package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
	
	private String nome;
	private int nascidosApartirDe;
	private List<Inscricao> inscricoes;
	private Campeonato campeonato;
	private List<Fase> fases;
	private int minJogadores;
	private int maxJogadores;
	private Enum sexo;
	
	
	public Categoria(){
		inscricoes = new ArrayList<Inscricao>();
		fases = new ArrayList<Fase>();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getNascidosApartirDe() {
		return nascidosApartirDe;
	}


	public void setNascidosApartirDe(int nascidosApartirDe) {
		this.nascidosApartirDe = nascidosApartirDe;
	}


	public Campeonato getCampeonato() {
		return campeonato;
	}


	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}


	public int getMinJogadores() {
		return minJogadores;
	}


	public void setMinJogadores(int minJogadores) {
		this.minJogadores = minJogadores;
	}


	public int getMaxJogadores() {
		return maxJogadores;
	}


	public void setMaxJogadores(int maxJogadores) {
		this.maxJogadores = maxJogadores;
	}


	public Enum getSexo() {
		return sexo;
	}


	public void setSexo(Enum sexo) {
		this.sexo = sexo;
	}


	public List<Inscricao> getInscricoes() {
		return inscricoes;
	}

	public void addInscricao(Inscricao i)
	{
		inscricoes.add(i);
	}

	public List<Fase> getFases() {
		return fases;
	}
	
	public void addFase(Fase f){
		fases.add(f);
	}
	
	

}
