/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class ListaCircular {

    private int clientes = 0;
    private NodoMesa inicio;
    private NodoMesa fin;
    private NodoMesa regi;
    Cola colamesa = new Cola();
    private int TotalMesa = 1;
    private int contador = 1;

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
            regi = nuevo;
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

    public void PagarMesa(Cola General) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual mesa desea pagar?+\n" + mostrarElementosStr()));
        Mesa m = agarrar(op);
        colamesa.encolarMesa(m.getPedidoMesa());
        General.encolarMesa(m.getPedidoMesa());
        Pedido p = new Pedido();
        m.setPedidoMesa(p);
        m.setVacia(true);
        this.clientes -= 1;
    }

    public void AtenderMesa() {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual mesa desea atender?+\n" + mostrarElementosStr()));
        Mesa m = agarrar(op);
        if (m.isVacia()) {
            Pedido p = new Pedido();
            m.setPedidoMesa(p);
            ListaSimple l = new ListaSimple();
            p.setOrdenes(l);
            p.setnumPedidoAuto(this.contador);
            HacerPedido(p, true);
            p.setStringPedido("");//talvez se pueda quitar esto
            p.agregarStrPedido(p.getOrdenes().toString());
            this.contador += 1;
            m.setVacia(false);
            this.clientes += 1;
        } else {
            Pedido p = m.getPedidoMesa();
            HacerPedido(p, true);
            p.setStringPedido("");//talvez se pueda quitar esto
            p.agregarStrPedido(p.getOrdenes().toString());
        }
    }

    public String mostrarElementosStr() {
        String s = "", strPedido;
        NodoMesa aux = inicio;
        int numMesa;
        numMesa = aux.getElemento().getNumMesa();
        strPedido = aux.getElemento().getPedidoMesa().getStringPedido();
        if (strPedido != null) {
            s += numMesa + ".\n" + strPedido + "\n";
        } else {
            s += numMesa + ".\n...\n";
        }
        aux = aux.getSiguiente();
        while (aux != inicio) {
            numMesa = aux.getElemento().getNumMesa();
            strPedido = aux.getElemento().getPedidoMesa().getStringPedido();
            if (strPedido != null) {
                s += numMesa + ".\n" + strPedido + "\n";
            } else {
                s += numMesa + ".\nVacia...\n";
            }
            aux = aux.getSiguiente();
        }
        return ("Lista de mesas: \n" + s);
    }

    public Mesa agarrar(int num) {
        boolean seguir = true;
        NodoMesa aux = inicio;
        if (num == aux.getElemento().getNumMesa()) {
            seguir = false;
            return aux.getElemento();
        }
        aux = aux.getSiguiente();
        while (aux != inicio || seguir) {
            if (num == aux.getElemento().getNumMesa()) {
                seguir = false;
                return aux.getElemento();
            }
            aux = aux.getSiguiente();
        }
        return null;
    }

    public void mostrarElementos() {
        if (this.clientes >= 1) {
            JOptionPane.showMessageDialog(null, mostrarElementosStr());
        } else {
            JOptionPane.showMessageDialog(null, "Aun no hay clientes...");
        }
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

    public void mostrarRegistro() {
        JOptionPane.showMessageDialog(null, colamesa.toString());
        
    }
    
}
