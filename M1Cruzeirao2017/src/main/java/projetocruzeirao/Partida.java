package projetocruzeirao;

import java.util.List;


public class Partida {
    
    private Local local;
    private boolean mandante;
    private Usuario usuarioJuiz;
    private Categoria categoria;
    private List<Times> times;
    private String horario;

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

    public boolean isMandante() {
        return mandante;
    }

    public void setMandante(boolean mandante) {
        this.mandante = mandante;
    }

    public Usuario getUsuarioJuiz() {
        return usuarioJuiz;
    }

    public void setUsuarioJuiz(Usuario usuarioJuiz) {
        this.usuarioJuiz = usuarioJuiz;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Times> getTimes() {
        return times;
    }

    public void addTimes(Times time) {
        this.times.add(time);
    }
    
    
}
