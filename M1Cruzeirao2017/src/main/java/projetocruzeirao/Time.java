package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Time {
    
    private String nome;
    private Usuario diretor;
    private Partida partida;
    private Inscricao inscricao;
    private List<Usuario> listUsuarios;
    
    public Time(){
     listUsuarios = new ArrayList<Usuario>();
    }
    
    

    public List<Usuario> getListUsuarios() {
  return listUsuarios;
 }



 public void addListUsuarios(Usuario listUsuarios) {
  this.listUsuarios.add(listUsuarios);
 }



 public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Usuario getDiretor() {
        return diretor;
    }

    public void setDiretor(Usuario diretor) {
        this.diretor = diretor;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }

    public Inscricao getInscricao() {
        return inscricao;
    }

    public void setInscricao(Inscricao inscricao) {
        this.inscricao = inscricao;
    }
  
    
    
}