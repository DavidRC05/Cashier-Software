/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

/**
 *
 * @author Arturo
 */
public class NodoPedido {
    private Pedido elemento;
    private NodoPedido siguiente;
    private NodoPedido regi;
    public NodoPedido(){
        this.siguiente=null;
    }

    /**
     * @return the elemento
     */
    public Pedido getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Pedido elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoPedido getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoPedido siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPedido getRegi() {
        return regi;
    }

    public void setRegi(NodoPedido regi) {
        this.regi = regi;
    }
}
