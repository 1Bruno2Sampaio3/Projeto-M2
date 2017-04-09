package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Campeonato {

    private int ano;
    private double duracao;
    private boolean periodo_inscr;
    private double taxa;
    private int qtd_categoria_min, qtd_jogador_min, qtd_jogador_max;
    private List<Categoria> categorias = new ArrayList<Categoria>();
    
    public Campeonato(){
     categorias = new ArrayList<Categoria>();
    }

    public List<Categoria> getCategorias() {
  return categorias;
 }

 public void setCategorias(Categoria categoria) {
  this.categorias.add(categoria);
 }

 public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

 public boolean isPeriodo_inscr() {
  return periodo_inscr;
 }

 public void setPeriodo_inscr(boolean periodo_inscr) {
  this.periodo_inscr = periodo_inscr;
 }

 public int getQtd_categoria_min() {
  return qtd_categoria_min;
 }

 public void setQtd_categoria_min(int qtd_categoria_min) {
  this.qtd_categoria_min = qtd_categoria_min;
 }

 public int getQtd_jogador_min() {
  return qtd_jogador_min;
 }

 public void setQtd_jogador_min(int qtd_jogador_min) {
  this.qtd_jogador_min = qtd_jogador_min;
 }

 public int getQtd_jogador_max() {
  return qtd_jogador_max;
 }

 public void setQtd_jogador_max(int qtd_jogador_max) {
  this.qtd_jogador_max = qtd_jogador_max;
 }

    
}