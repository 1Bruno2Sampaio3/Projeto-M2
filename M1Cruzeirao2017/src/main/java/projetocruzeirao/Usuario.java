package projetocruzeirao;

import java.util.List;


public class Usuario {
    
    private String nome, CPF, email;
    private List<String> tipo, penalidades;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getTipo() {
        return tipo;
    }

    public void addTipo(String tipo) {
        this.tipo.add(tipo);
    }

    public List<String> getPenalidades() {
        return penalidades;
    }

    public void addPenalidades (String penalidades) {
        this.penalidades.add(penalidades);
    }
    
    
    
    
}
