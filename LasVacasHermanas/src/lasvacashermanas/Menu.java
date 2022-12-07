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
            int op = Integer.parseInt(JOptionPane.showInputDialog(null, "¡¡¡Bienvenido a Las Vacas Hermanas!!!\n"
                    + "1- Agregar nodo\n"
                    + "2- Mostrar nodo\n"
                    + "3- Mostrar numero menor\n"
                    + "4- Mostrar hojas del arbol\n"
                    + "5- Mostrar cantidad de nodos en el sistema\n"
                    + "6- Mostrar altura del arbol\n"
                    + "7- Encontrar el nivel de un elemento\n"
                    + "8- Mostrar rama mas larga\n"
                    + "9- Salir...\n"
                    + "Digite su opción: \n", "Menu Principal", JOptionPane.PLAIN_MESSAGE));
            switch (op) {
                case 1:
                try {
                //    a.crearRaiz();
                } catch (Exception e) {
                    System.out.println("Digite correctamente la informacion...");
                } finally {
                }
                mostrar();
                break;
                case 2:
                    //a.mostrarRaiz();
                    mostrar();
                    break;
                case 3:
                    //a.imprimeMenor();
                    mostrar();
                    break;
                case 4:
                    //a.imprimeHojas();
                    mostrar();
                    break;
                case 5:
                    //a.CuentaNodos();
                    mostrar();
                    break;
                case 6:
                   // System.out.print("La altura del arbol es: " + a.getAltura() + "\n");
                    mostrar();
                    break;
                case 7:
               /**try {
                    if (!a.vacio()) {
                        int x = a.Nivel(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento del cual quiere ver su nivel en el arbol: \n")));
                        if (x < 0) {
                            System.out.print("Ese elemento no existe dentro de nuestro sistema");
                        } else {
                            System.out.print("El nivel es: " + x);
                        }
                    } else {
                        System.out.println("El arbol se encuetra vacio...");
                    }

                } catch (HeadlessException | NumberFormatException e) {
                    System.out.println("Error...\n" + e.getMessage());
                }
                mostrar();
                break;
                case 8:
                    if (!a.vacio()) {
                        a.ImprimeRamaLarga();
                    } else {
                        System.out.println("El arbol se encuentra vacio");
                    }
                    mostrar();
                    break;
                    **/
                case 9:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción inválida");
                    //mostrar();
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println("Error...\n" + e.getMessage());
            mostrar();
        }
        mostrar();
    }
}
