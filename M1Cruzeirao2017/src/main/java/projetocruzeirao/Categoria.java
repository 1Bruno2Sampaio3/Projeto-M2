package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    
    private int idademinima;
    private char sexo;
    private boolean novosJogadores;
    private boolean novosTimes;
    private List<Inscricao>inscricoes;
    private Campeonato campeonato;
    
    public Categoria(){
     inscricoes = new ArrayList<Inscricao>();
    }
    
    public List<Inscricao> getInscricoes() {
  return inscricoes;
 }

 public void AddInscricoes(Inscricao inscricao) {
  this.inscricoes.add(inscricao);
 }

 public Campeonato getCampeonato() {
  return campeonato;
 }

 public void setCampeonato(Campeonato campeonato) {
  this.campeonato = campeonato;
 }

 public int getIdademinima() {
        return idademinima;
    }

    public void setIdademinima(int idademinima) {
        this.idademinima = idademinima;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isNovosJogadores() {
        return novosJogadores;
    }

    public void setNovosJogadores(boolean novosJogadores) {
        this.novosJogadores = novosJogadores;
    }

    public boolean isNovosTimes() {
        return novosTimes;
    }

    public void setNovosTimes(boolean novosTimes) {
        this.novosTimes = novosTimes;
    }
    
    
    
    
    
}