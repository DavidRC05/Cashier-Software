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
    private int numPedido;
     public Pedido(){
       this.numPedido = 0;
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
    public int getNumPedido() {
        return numPedido;
    }

    /**
     * @param numPedido the numPedido to set
     */
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
}
