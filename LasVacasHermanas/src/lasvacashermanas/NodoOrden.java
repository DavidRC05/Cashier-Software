/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

/**
 *
 * @author Arturo
 */
public class NodoOrden {
    private Orden dato;
    private NodoOrden siguiente;

    public NodoOrden() {
        this.siguiente = null;
    }

    /**
     * @return the dato
     */
    public Orden getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Orden dato) {
        this.dato = dato;
    }

    /**
     * @return the siguiente
     */
    public NodoOrden getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoOrden siguiente) {
        this.siguiente = siguiente;
    }
}
