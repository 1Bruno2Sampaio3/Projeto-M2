package projetocruzeirao;

public class Categoria {
    
    private int idademinima;
    private char sexo;
    private boolean novosJogadores;
    private boolean novosTimes;
    

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
