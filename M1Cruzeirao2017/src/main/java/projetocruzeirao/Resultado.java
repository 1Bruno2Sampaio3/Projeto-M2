package projetocruzeirao;

import java.util.List;


public class Resultado {
    
    private int golsVisitantes;
    private int golsMandante;
    private List<Usuario> usuarios;
    private Partida partida;

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
