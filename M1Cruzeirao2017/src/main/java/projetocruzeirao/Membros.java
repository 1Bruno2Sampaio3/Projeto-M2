package projetocruzeirao;

import java.util.List;

public class Membros {
    
    private List<Usuario> listaUsuarios;

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void addListaUsuarios(Usuario u) {
        listaUsuarios.add(u);
    }
    
    
}
