package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Tipos {
    
    private List<String> tipos;
    public Tipos(){
     tipos = new ArrayList<String>();
    }
    public List<String> getTipos() {
        return tipos;
    }

    public void addTipos(String tipos) {
        this.tipos.add(tipos);
    }

}