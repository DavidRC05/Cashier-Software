/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

/**
 *
 * @author Arturo
 */
public class Pedido {
    private ListaSimple ordenes;
    private int numPedidoAuto;
    private String StringPedido;
     public Pedido(){
       this.numPedidoAuto = 0;
       this.ordenes = null;
    }

    /**
     * @return the ordenes
     */
    public ListaSimple getOrdenes() {
        return ordenes;
    }

    /**
     * @param ordenes the ordenes to set
     */
    public void setOrdenes(ListaSimple ordenes) {
        this.ordenes = ordenes;
    }

    /**
     * @return the numPedido
     */
    public int getnumPedidoAuto() {
        return numPedidoAuto;
    }

    /**
     * @param numPedido the numPedido to set
     */
    public void setnumPedidoAuto(int numPedido) {
        this.numPedidoAuto = numPedido;
    }
    public void agregarStrPedido(String x){
        this.setStringPedido(this.getStringPedido() + x);
    }

    /**
     * @return the StringPedido
     */
    public String getStringPedido() {
        return StringPedido;
    }

    /**
     * @param StringPedido the StringPedido to set
     */
    public void setStringPedido(String StringPedido) {
        this.StringPedido = StringPedido;
    }
}
