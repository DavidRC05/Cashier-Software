/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Mathias
 */
public class ResgistroAutoservice {
    
    Cola c = new Cola();
    private NodoPedido inicio;
    @Override
    public String toString() {
        int cont = 1;
        String s = "";
        if (!c.vacia()) {
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
}
