/*
Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */
package Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise1 {
    public static void main(String[] args) {
        int numero,cuadrado;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("***** INSERT A NUMBER *****"));
        
        while(numero >= 0){
            cuadrado = (int)Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "*** NUMERO ELEVADO AL CUADRADO = " + cuadrado);
            
            numero = Integer.parseInt(JOptionPane.showInputDialog("***** OTHER NUMBER *****"));
        }
        
    }
}
