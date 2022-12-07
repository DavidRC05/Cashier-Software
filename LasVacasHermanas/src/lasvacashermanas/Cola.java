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
    private int contador = 1;
    private NodoPedido inicio;
    private NodoPedido fin;

    public Cola() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        return inicio == null;
    }

    public void encolar(ListaSimple Registro) {
        Pedido p = new Pedido();
        ListaSimple l = new ListaSimple();
        NodoPedido nuevo = new NodoPedido();
        p.setOrdenes(l);
        p.setnumPedidoAuto(this.contador);
        HacerPedido(p, true);
        p.agregarStrPedido(p.getOrdenes().toString());
        nuevo.setElemento(p);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        this.contador+=1;
    }

    //agregar lo de que se meta en los registros
    public void desencolar() {
        if (!vacia()) {
            JOptionPane.showMessageDialog(null, "El pedido #"+inicio.getElemento().getnumPedidoAuto()+" se ha completado");
            inicio = inicio.getSiguiente();
        } else {
            JOptionPane.showMessageDialog(null, "No hay pedidos en la cola");
        }
    }

    @Override
    public String toString() {
        int cont = 1;
        String s = "";
        if (!vacia()) {
            NodoPedido aux = inicio;
            while (aux != null) {
                s += cont+".\n"+aux.getElemento().getOrdenes().toString();
                aux = aux.getSiguiente();
                cont+=1;
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
    public void HacerPedido(Pedido p, boolean Seguir) {
        if (Seguir) {
            p.getOrdenes().agregar(); //
            try {
                int op = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Desea ordenar algo mas?\n"
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
}
