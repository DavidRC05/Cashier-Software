/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Cola {

    private NodoPedido inicio;
    private NodoPedido fin;

    public Cola() {
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

    public void encolar() {
        Pedido p = new Pedido();

        //hacer aqui todo lo de los productos
        //debe hacerse esta parte recursiva
        p.setNumPedido(0);
        HacerPedido(p, true);

        NodoPedido nuevo = new NodoPedido();
        nuevo.setElemento(p);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }

    //agregar lo de que se meta en los registros
    public void desencolar() {
        if (!vacia()) {
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento fue extraído",
                    "Desencolar", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon("src/img/pag.png"));
        } else {
            JOptionPane.showMessageDialog(null, "El elemento no se puede extraer",
                    "Cola Vacía", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon("src/img/open.png"));
        }
    }

    /*
    @Override
    public String toString() {
        String s = "";
        if (!vacia()) {
            NodoPedido aux = inicio;
            while (aux != null) {
                s += aux.getElemento().getNombre() + " / "
                        + aux.getElemento().getCalificacion() + "<-";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La Cola contiene: \n" + s,
                    "Contenido Cola", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon("src/img/open.png"));
        } else {
            JOptionPane.showMessageDialog(null, "No existen elementos para mostrar",
                    "Cola Vacía", JOptionPane.INFORMATION_MESSAGE,
                    new ImageIcon("src/img/open.png"));
        }
        return s;
    }
     */
    public void HacerPedido(Pedido p, boolean Seguir) {
        p.getOrdenes().agregar();
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea ordenar algo mas?\n"
                    + "1. Si\n"
                    + "2. No"));
            switch (op) {
                case 1:
                    Seguir = true;
                    break;
                case 2:
                    Seguir = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                    HacerPedido(p, Seguir);
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
        }
         HacerPedido(p, Seguir);
    }
}
