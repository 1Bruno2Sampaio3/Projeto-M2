package projetocruzeirao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Campeonato {
	
	private String nome;
	private List<Local> locais;
	private List<Juiz> juizes;
	private List<Categoria> categorias;
	private Calendar dataInicioInscricao;
	private Calendar dataFimInscricao;
	private Calendar dataInicioCampeonato;
	private Calendar dataFimCampeonato;
	private double valorTaxa;
	
	public Campeonato(){
		locais = new ArrayList<Local>();
		juizes = new ArrayList<Juiz>();
		categorias = new ArrayList<Categoria>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataInicioInscricao() {
		return dataInicioInscricao;
	}

	public void setDataInicioInscricao(Calendar dataInicioInscricao) {
		this.dataInicioInscricao = dataInicioInscricao;
	}

	public Calendar getDataFimInscricao() {
		return dataFimInscricao;
	}

	public void setDataFimInscricao(Calendar dataFimInscricao) {
		this.dataFimInscricao = dataFimInscricao;
	}

	public Calendar getDataInicioCampeonato() {
		return dataInicioCampeonato;
	}

	public void setDataInicioCampeonato(Calendar dataInicioCampeonato) {
		this.dataInicioCampeonato = dataInicioCampeonato;
	}

	public Calendar getDataFimCampeonato() {
		return dataFimCampeonato;
	}

	public void setDataFimCampeonato(Calendar dataFimCampeonato) {
		this.dataFimCampeonato = dataFimCampeonato;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	public List<Local> getLocais() {
		return locais;
	}
	
	public void addLocal(Local l)
	{
		locais.add(l);
	}

	public List<Juiz> getJuizes() {
		return juizes;
	}
	
	public void addJuiz(Juiz j)
	{
		juizes.add(j);
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}
	
	public void addCategoria(Categoria c){
		categorias.add(c);
	}
}
