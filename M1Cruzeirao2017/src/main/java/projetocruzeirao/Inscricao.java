package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {
    
    private long numero;
    private boolean pagamento;
    private boolean validada;
    private List<Inscrito> inscritos; 
    private Categoria categoria;
    private List<Partida> partidas;
    private Equipe equipe;
    
    public Inscricao(){
    	inscritos = new ArrayList<Inscrito>();
    	partidas = new ArrayList<Partida>();
    }

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public boolean isPagamento() {
		return pagamento;
	}

	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}

	public boolean isValidada() {
		return validada;
	}

	public void setValidada(boolean validada) {
		this.validada = validada;
	}

	public List<Inscrito> getIncritos() {
		return inscritos;
	}

	public void addInscrito(Inscrito i) {
		inscritos.add(i);
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void addPartida(Partida p) {
		partidas.add(p);
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
    
}