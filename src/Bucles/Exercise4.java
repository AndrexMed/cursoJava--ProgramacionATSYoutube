/*
 Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
package Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise4 {

    public static void main(String[] args) {
        int numero,
            elementos = 0,
            suma = 0;
        float media;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("***** INSERT A NUMBER *****"));
        
        while (numero > 0) {
            suma = suma + numero;  //Suma iterativa
            elementos++;  //Aumentamos uno a elementos
            
            numero = Integer.parseInt (JOptionPane.showInputDialog("***** INSER OTHER NUMBER *****"));
        }
        
        if (elementos == 0) {
            System.out.println("**** ERROR -- LA DIVISION ENTRE CERO NO EXISTE!! *****");
        } else {
            
            media = (float)suma/elementos;
            System.out.println("*****LA MEDIA ES: "+media);
        }
        
    }
}
