/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

/**
 *
 * @author Arturo
 */
public class Mesa {
    private int numMesa;
    private Pedido pedidoMesa;
    private boolean vacia;
     public Mesa() {
        this.numMesa = 0;
        this.pedidoMesa = null;
        this.vacia = true;
    }

    /**
     * @return the numMesa
     */
    public int getNumMesa() {
        return numMesa;
    }

    /**
     * @param numMesa the numMesa to set
     */
    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    /**
     * @return the pedidoMesa
     */
    public Pedido getPedidoMesa() {
        return pedidoMesa;
    }

    /**
     * @param pedidoMesa the pedidoMesa to set
     */
    public void setPedidoMesa(Pedido pedidoMesa) {
        this.pedidoMesa = pedidoMesa;
    }

    /**
     * @return the vacia
     */
    public boolean isVacia() {
        return vacia;
    }

    /**
     * @param vacia the vacia to set
     */
    public void setVacia(boolean vacia) {
        this.vacia = vacia;
    }
}
