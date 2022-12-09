/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lasvacashermanas;

import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Arturo
 */
public class Menu {

    ListaCircular ListaMesas = new ListaCircular();
    ListaSimple RegistroAutoServicio = new ListaSimple();
    ListaSimple RegistroServicioMesa = new ListaSimple();
    ListaSimple RegistroGeneral = new ListaSimple();
    Cola ColaAutoServicio = new Cola();
    boolean ListaCircularCreado = false;
    

    //Arbol a = new Arbol();
    public void inicio(){
         Icon icono = new ImageIcon(getClass().getResource("/lasvacashermanas/WhatsApp Image 2022-12-06 at 9.44.13 PM.jpeg"));
         JOptionPane.showMessageDialog(null, "", "Bienvenido", JOptionPane.PLAIN_MESSAGE, icono);
         mostrar();
    }
    public void mostrar() {
       Icon icono = new ImageIcon(getClass().getResource("/lasvacashermanas/WhatsApp Image 2022-12-06 at 9.44.13 PM.jpeg"));
        if (!ListaCircularCreado) {
            for (int i = 0; i < 10; i++) {
                ListaMesas.insertar();
            }
        }
        ListaCircularCreado = true;
        try {
           
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "      ¡Bienvenido a Las Vacas Hermanas!      \n"
                    + "1. Servicio de mesa\n"
                    + "2. Autoservicio\n"
                    + "3. Registro\n"
                    + "4. Salir\n"
                    + "Digite su opción: \n", "Menu Principal",JOptionPane.PLAIN_MESSAGE));
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
                    + "4. volver\n"
                    + "Digite su opción: \n", "Servicio de mesa", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    ListaMesas.AtenderMesa();
                    MostrarServicioDeMesa();
                    break;
                case 2:
                    ListaMesas.PagarMesa();
                    MostrarServicioDeMesa();
                    break;
                case 3:
                    ListaMesas.mostrarElementos();
                    MostrarServicioDeMesa();
                    break;
                case 4:              
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

    public void MostrarAutoservicio() {
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Autoservicio:\n"
                    + "1. Agregar pedido\n"
                    + "2. Entregar pedido\n"
                    + "3. Ver cola\n"
                    + "4. volver\n"
                    + "Digite su opción: \n", "Autoservicio", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    ColaAutoServicio.encolar(this.RegistroAutoServicio);
                    MostrarAutoservicio();
                    break;
                case 2:
                    ColaAutoServicio.desencolar();
                    MostrarAutoservicio();
                    break;
                case 3:
                    ColaAutoServicio.toString();
                    MostrarAutoservicio();
                    break;
                case 4:
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

    public void MostrarRegistro() {
        try {
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "Registro:\n"
                    + "1. Registro general\n"
                    + "2. Registro autoservicio\n"
                    + "3. Registro servicio de mesa\n"
                    + "4. Volver\n"
                    + "Digite su opción: \n", "Registro", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                    MostrarRegistro();
                    break;
                case 2:
                    ColaAutoServicio.Registro();
                    MostrarRegistro();
                    break;
                case 3:
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
