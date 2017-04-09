package projetocruzeirao;

import java.util.ArrayList;
import java.util.List;

public class Inscricao {
    
    private boolean pago;
    private boolean informacoesvalidas;
    private Categoria categoria;
    private List<Time> times;
    private Membro membros_confir;
    
    public Inscricao(){
     times = new ArrayList<Time>();
    }
    public Membro getMembros_confir() {
  return membros_confir;
 }

 public void setMembros_confir(Membro membros_confir) {
  this.membros_confir = membros_confir;
 }

 public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void AddTimes(Time time) {
        this.times.add(time);
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