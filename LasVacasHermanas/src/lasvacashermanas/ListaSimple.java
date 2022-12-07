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
public class ListaSimple {
     private NodoOrden inicio;

    public ListaSimple() {
        this.inicio = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void agregar() {
        Orden o = new Orden();
        NodoOrden nuevo = new NodoOrden();
        TomarOrden(o);
        
        o.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null, "Indique cuantos quiere del producto: "+o.getProducto())));
        o.setTotal(o.getCantidad()*o.getPrecio());
        o.HacerOrdenStr();
        nuevo.setDato(o);
        if (vacia()) {
            inicio = nuevo;
        } else if (o.getCantidad()< inicio.getDato().getCantidad()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);
        } else {
            NodoOrden aux = inicio;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getDato().getCantidad() < o.getCantidad()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }

    public void extraer() {
        if (!vacia()) {
            JOptionPane.showMessageDialog(null, "El pedido numero ");
            inicio = inicio.getSiguiente();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo extraer, lista vacía");
        }
    }

  
    @Override
    public String toString() {
        String datos = "";
        if (!vacia()) {
            NodoOrden aux = inicio;
            while (aux != null) {
                datos += aux.getDato().getOrdenStr();
                aux = aux.getSiguiente();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo mostar",
                    "Lista Vacía", JOptionPane.ERROR_MESSAGE);
        }
        return datos;
    }
public void TomarOrden(Orden o){
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Menu Principal de Las Vacas Hermanas\n"
                    + "1. Bebidas\n"
                    + "2. Hamburguesas\n"
                    + "3. Postres\n"
                    + "Digite su opción: \n", "Menu Principal", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    Bebidas(o);
                    break;
                case 2:
                    Hamburguesas(o);
                    break;
                case 3:
                    Postres(o);
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            TomarOrden(o);
        }
    

     }
public void Bebidas(Orden o){
    try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Bebidas:\n"
                    + "1. Gaseosa\n"
                    + "2. Natural\n"
                    + "3. Agua\n"
                    + "4. Cerveza\n"
                    + "5. volver\n"                
                    + "Digite su opción: \n", "Bebidas", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    //
                    o.setProducto("Gaseosa");
                    o.setPrecio(500);
                    break;
                case 2:
                    o.setProducto("Natural");
                    o.setPrecio(600);           
                    break;
                case 3:
                    o.setProducto("Agua");
                    o.setPrecio(25);
                    break;
                case 4:
                    o.setProducto("Cerveza");
                    o.setPrecio(700);                   
                    break;
                case 5:
                    TomarOrden(o);
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                     Bebidas(o);
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            Bebidas(o);
        }
        
    }
public void Hamburguesas(Orden o){
    try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Hamburguesas:\n"
                    + "1. Hamburguesa de queso\n"
                    + "2. Hamburguesa doble\n"
                    + "3. Hamburguesa triple\n"
                    + "4. Hamburguesa La Vaca Feliz\n"
                    + "5. Hamburguesa La Vaca Vegana\n"
                    + "6. volver\n"                
                    + "Digite su opción: \n", "Hamburguesas", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    //
                    o.setProducto("Hamburguesa de queso");
                    o.setPrecio(1500);
                    break;
                case 2:
                    o.setProducto("Hamburguesa doble");
                    o.setPrecio(2000);           
                    break;
                case 3:
                    o.setProducto("Hamburguesa triple");
                    o.setPrecio(3000);
                    break;
                case 4:
                    o.setProducto("Hamburguesa La Vaca Feliz");
                    o.setPrecio(2500);
                    break;
                case 5:
                    o.setProducto("Hamburguesa La Vaca Vegana");
                    o.setPrecio(2500);
                    break;
                case 6:
                    TomarOrden(o);
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                     Hamburguesas(o);
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            Hamburguesas(o);
        }
        
    }
public void Postres(Orden o){
    try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Postres:\n"
                    + "1. Tres Leches\n"
                    + "2. Helado de vaca\n"
                    + "3. Vacacique\n"
                    + "4. Pastel de vaca\n"
                    + "5. volver\n"                
                    + "Digite su opción: \n", "Postres", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    //
                    o.setProducto("Tres Leches");
                    o.setPrecio(3000);
                    break;
                case 2:
                    o.setProducto("Helado de vaca");
                    o.setPrecio(1000);           
                    break;
                case 3:
                    o.setProducto("Vacacique");
                    o.setPrecio(5000);
                    break;
                case 4:
                    o.setProducto("Pastel de vaca");
                    o.setPrecio(1500);
                    break;
                case 5:
                    TomarOrden(o);
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                     Postres(o);
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            Postres(o);
        }
}
}
