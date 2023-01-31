/*
Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y luego 
ir pidiendo números indicando “es mayor” o “es menor” según sea mayor o menor con respecto a N. El proceso termina     
cuando el usuario acierta y mostrar el número de intentos.
 */
package Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise3 {
    public static void main(String[] args) {
        int numero,aleatorio,contador=0;
        
        aleatorio = (int)(Math.random()*100);   //Numero aleatorio entre 0y100
        
        do {            
           numero = Integer.parseInt(JOptionPane.showInputDialog("***** ENTER A NUMBER *****"));
            if (aleatorio > numero) {
                System.out.println("***** INGRESE UN NUMERO MAYOR *****");
            } else {
                System.out.println("***** INGRESE UN NUMERO MENOR *****");
            }
             contador++;       
        } while (numero != aleatorio);
        
        JOptionPane.showMessageDialog(null, "***** CONGRATULATIONS!!! YOU HAVE A GOOD LOOK!! INTENTOS: "+contador);
    }
}
