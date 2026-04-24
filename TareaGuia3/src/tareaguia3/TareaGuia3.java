/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaguia3;
import javax.swing.JOptionPane;

/**
 *
 * @author 50233
 */
public class TareaGuia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JOptionPane.showMessageDialog(null, "La palabra de paso no es correcta", "Error", JOptionPane.ERROR_MESSAGE);
        int buton = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
        String clave = JOptionPane.showInputDialog("Palabra de paso:");
        String nombreCorrecto = "Titty";
        String nombreIngresado = JOptionPane.showInputDialog("Ingrese su nombre:");
            if (nombreIngresado.equalsIgnoreCase(nombreCorrecto)) {
            JOptionPane.showMessageDialog(null, "Bienvenido " + nombreIngresado);
        } else {
            JOptionPane.showMessageDialog(null, "Datos Incorrecto", "Error", JOptionPane.ERROR_MESSAGE);
        }
            Object[] opciones = {"Si, gracias", "No, gracias", "Mas..."};
            JOptionPane.showOptionDialog(null, "¿Se ha solucionado el problema?", "Soluciones",
                    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);
    }
    
}
