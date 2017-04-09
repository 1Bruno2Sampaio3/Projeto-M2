package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Membro {
    
    private List<Usuario> listaUsuarios;
    
    public Membro(){
     listaUsuarios = new ArrayList<Usuario>();
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void addListaUsuarios(Usuario u) {
        listaUsuarios.add(u);
    }
    
    
}