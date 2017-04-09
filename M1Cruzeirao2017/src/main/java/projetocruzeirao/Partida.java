package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;


public class Partida {
    
    private Local local;
    private List<Usuario> usuarioJuiz;
    private Categoria categoria;
    private Time visitante, mandante;
    private String horario;
    private Partida proxima;
    
    public Partida(){
     usuarioJuiz = new ArrayList<Usuario>();
    }

    public Time getVisitante() {
  return visitante;
 }
 public void setVisitante(Time visitante) {
  this.visitante = visitante;
 }
 public Time getMandante() {
  return mandante;
 }
 public void setMandante(Time mandante) {
  this.mandante = mandante;
 }
 public Partida getProxima() {
  return proxima;
 }
 public void setProxima(Partida proxima) {
  this.proxima = proxima;
 }
    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public List<Usuario> getUsuarioJuiz() {
        return usuarioJuiz;
    }

    public void addUsuarioJuiz(Usuario usuarioJuiz) {
        this.usuarioJuiz.add(usuarioJuiz);
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
}