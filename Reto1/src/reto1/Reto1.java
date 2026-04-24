/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reto1;

/**
 *
 * @author 50233
 */
public class Reto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        javax.swing.ImageIcon icono = new javax.swing.ImageIcon(Reto1.class.getResource("logog.png"));
        Object[] valores = {"uno", "dos", "tres"};
        Object seleccion = javax.swing.JOptionPane.showInputDialog(
                null,
                "Seleccione una opción",
                "Lista de valores",
                javax.swing.JOptionPane.INFORMATION_MESSAGE,
                icono,
                valores,
                valores[0]
        );
        
    }
    
}
