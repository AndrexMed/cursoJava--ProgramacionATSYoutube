/*
Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
 */
package Introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise4 {
    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Digite un caracter").charAt(0);
        
        if (Character.isUpperCase(letra)) {  // Este metodo me devuelve un booleano
            System.out.println("Es una letra mayuscula");
        } else {
            System.out.println("Es una letra minuscula");
        }
    }
}
