/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class ListaCircular {
     private NodoMesa inicio;
    private NodoMesa fin;
    private int TotalMesa = 1;

    public ListaCircular() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertar() {
        Mesa m = new Mesa();
        Pedido p = new Pedido();
        //aqui van los sets
        m.setNumMesa(this.TotalMesa);
        m.setPedidoMesa(p);
        m.setVacia(true);
        NodoMesa nuevo = new NodoMesa();
        nuevo.setElemento(m);
        this.TotalMesa += 1;
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (m.getNumMesa() < inicio.getElemento().getNumMesa()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (m.getNumMesa() > fin.getElemento().getNumMesa()) {
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            NodoMesa aux = inicio;
            while (aux.getSiguiente().getElemento().getNumMesa() < m.getNumMesa()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public void extraer() {
        if (!vacia()) {
            inicio = inicio.getSiguiente();
            fin.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null, "El elemento fue extraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía");
        }
    }

    public void mostrarElementos() {
        /**
        String s = "";
        Nodo aux = inicio;
        s += aux.getElemento().getNombCurso() + "//"
                + aux.getElemento().getCantCreditos() + "//"
                + aux.getElemento().getPrecio() + "<=>";
        aux = aux.getSiguiente();
        while (aux != inicio) {
            s += aux.getElemento().getNombCurso() + "//"
                    + aux.getElemento().getCantCreditos() + "//"
                    + aux.getElemento().getPrecio() + "<=>";
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "La lista contiene: \n" + s);
        * **/
    }
    
}
