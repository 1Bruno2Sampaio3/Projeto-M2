package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;


public class Resultado {
    
    private int golsVisitantes;
    private int golsMandante;
    private List<Usuario> usuarios;
    private Partida partida;
    private String penalidade_vizitante;
    private String penalidade_mandante;
    
    public Resultado(){
     usuarios =new ArrayList<Usuario>();
    }

    public String getPenalidade_vizitante() {
  return penalidade_vizitante;
 }

 public void setPenalidade_vizitante(String penalidade_vizitante) {
  this.penalidade_vizitante = penalidade_vizitante;
 }

 public String getPenalidade_mandante() {
  return penalidade_mandante;
 }

 public void setPenalidade_mandante(String penalidade_mandante) {
  this.penalidade_mandante = penalidade_mandante;
 }

 public int getGolsVisitantes() {
        return golsVisitantes;
    }

    public int getGolsMandante() {
        return golsMandante;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Partida getPartida() {
        return partida;
    }

    public void setGolsVisitantes(int golsVisitantes) {
        this.golsVisitantes = golsVisitantes;
    }

    public void setGolsMandante(int golsMandante) {
        this.golsMandante = golsMandante;
    }

    public void setPartida(Partida partida) {
        this.partida = partida;
    }
    
    public void addUusuario (Usuario usuario)
    {
        usuarios.add(usuario);
    }
    
}