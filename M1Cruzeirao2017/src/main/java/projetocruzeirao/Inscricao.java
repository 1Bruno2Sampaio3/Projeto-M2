
package projetocruzeirao;


public class Inscricao {
    
    private boolean pago;
    private boolean informacoesvalidas;
    private Categoria categoria;
    private Times time;

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Times getTime() {
        return time;
    }

    public void setTime(Times time) {
        this.time = time;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isInformacoesvalidas() {
        return informacoesvalidas;
    }

    public void setInformacoesvalidas(boolean informacoesvalidas) {
        this.informacoesvalidas = informacoesvalidas;
    }
}
