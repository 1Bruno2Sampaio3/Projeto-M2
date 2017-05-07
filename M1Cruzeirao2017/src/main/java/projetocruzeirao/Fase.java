package projetocruzeirao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Fase {
	
	private Calendar dataInicio;
	private Calendar dataFim;
	private Enum formato;
	private Categoria categoria;
	private List<Grupo> grupos;
	private int numero;
	
	
	public Fase(){
		grupos = new ArrayList<Grupo>();
	}


	public Calendar getDataInicio() {
		return dataInicio;
	}


	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}


	public Calendar getDataFim() {
		return dataFim;
	}


	public void setDataFim(Calendar dataFim) {
		this.dataFim = dataFim;
	}


	public Enum getFormato() {
		return formato;
	}


	public void setFormato(Enum formato) {
		this.formato = formato;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public List<Grupo> getGrupos() {
		return grupos;
	}
	
	public void addGrupo(Grupo g){
		grupos.add(g);
	}
	

}
