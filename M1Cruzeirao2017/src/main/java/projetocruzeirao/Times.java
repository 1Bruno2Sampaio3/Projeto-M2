package projetocruzeirao;


public class Times {
    
    private String nome;
    private Usuario diretor;
    private Partida partida;
    private Inscricao inscricao;
    private Membros membrosTime;

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

    public Membros getMembrosTime() {
        return membrosTime;
    }

    public void setMembrosTime(Membros membrosTime) {
        this.membrosTime = membrosTime;
    }
    
    
    
    
}
