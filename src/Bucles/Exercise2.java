/*
Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
 */
package Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise2 {
    public static void main(String[] args) {
        int numero;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("***** INGRESE UN NUMERO *****"));
        
        while (numero != 0) {
            if (numero %2 == 0) {
                JOptionPane.showMessageDialog(null, "***** PAR *****");
            } else {
                JOptionPane.showMessageDialog(null, "***** IMPAR *****");
            }
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("***** INGRESE other NUMERO *****"));
        }
    }
}
