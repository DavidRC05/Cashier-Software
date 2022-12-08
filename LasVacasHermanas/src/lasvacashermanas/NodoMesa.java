/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

/**
 *
 * @author Arturo
 */
public class NodoMesa {
   private  Mesa elemento;
    private NodoMesa siguiente;
    private NodoMesa anterior;

    public NodoMesa() {
        this.siguiente=null;
        this.anterior=null;        
    }

    /**
     * @return the elemento
     */
    public Mesa getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Mesa elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the siguiente
     */
    public NodoMesa getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoMesa siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoMesa getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoMesa anterior) {
        this.anterior = anterior;
    }
    
    
    
}
