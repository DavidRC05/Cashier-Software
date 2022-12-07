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
public class Menu {

    //Arbol a = new Arbol();
    public void mostrar() {
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "      ¡Bienvenido a Las Vacas Hermanas!      \n"
                    + "1. Servicio de mesa\n"
                    + "2. Autoservicio\n"
                    + "3. Registro\n"
                    + "4. Salir\n"
                    + "Digite su opción: \n", "Menu Principal", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    MostrarServicioDeMesa();
                    break;
                case 2:
                    MostrarAutoservicio();
                    break;
                case 3:
                    MostrarRegistro();
                    break;
                case 4:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                    mostrar();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            mostrar();
        }
    }

    public void MostrarServicioDeMesa() {
            try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Servicio de mesa:\n"
                    + "1. Atender mesa\n"
                    + "2. Pagar mesa\n"
                    + "3. Ver mesas\n"
                    + "4. Consultar mesa\n"
                    + "5. volver\n"                
                    + "Digite su opción: \n", "Servicio de mesa", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    //
                    MostrarServicioDeMesa();
                    break;
                case 2:
                    //
                    MostrarServicioDeMesa();
                    break;
                case 3:
                    //
                    MostrarServicioDeMesa();
                    break;
                case 4:
                    //
                    MostrarServicioDeMesa();
                    break;
                case 5:
                    mostrar();
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                    MostrarServicioDeMesa();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            MostrarServicioDeMesa();
        }
}
public void MostrarAutoservicio(){
    try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Autoservicio:\n"
                    + "1. Agregar pedido\n"
                    + "2. Entregar pedido\n"
                    + "3. Ver cola\n"
                    + "4. Consultar pedido\n"
                    + "5. volver\n"                
                    + "Digite su opción: \n", "Autoservicio", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    //
                    MostrarAutoservicio();
                    break;
                case 2:
                    //
                     MostrarAutoservicio();
                    break;
                case 3:
                    //
                     MostrarAutoservicio();
                    break;
                case 4:
                    //
                     MostrarAutoservicio();
                    break;
                case 5:
                    mostrar();
                    break;    
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                     MostrarAutoservicio();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            MostrarServicioDeMesa();
        }
        
    }
    public void MostrarRegistro(){
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Registro:\n"
                    + "1. Registro general\n"
                    + "2. Registro autoservicio\n"
                    + "3. Registro servicio de mesa\n"
                    + "4. Volver\n"                
                    + "Digite su opción: \n", "Registro", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    //
                    MostrarRegistro();
                    break;
                case 2:
                    //
                     MostrarRegistro();
                    break;
                case 3:
                    //
                    MostrarRegistro();
                    break;
                case 4:
                    mostrar();
                    break;  
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                     MostrarRegistro();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
             MostrarRegistro();
        }
        
    }
}
