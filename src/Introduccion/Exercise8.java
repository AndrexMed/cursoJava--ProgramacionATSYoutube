/*
Construir un programa que simule el funcionamiento de una calculadora que puede realizar las  cuatro operaciones aritméticas básicas 
(suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter 
del primer parámetro de la línea de comandos: S o s para la suma, R o r para la resta, P, p, M o m para el producto y D o d para la división.
 */
package Introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise8 {

    public static void main(String[] args) {
        int numero1, numero2,suma,resta,multi,division;
        char response;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));

        response = JOptionPane.showInputDialog("Ingrese la operacion a relizar \nS. suma, \nR. resta, \nM. multiplicacion, \nD.division").charAt(0);

        switch (response) {
            case 'S':
                case 's':
                suma = numero1 + numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " +suma);
                break;
            case 'R':
                case 'r':
                resta = numero1 - numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " +resta);
                break;
            case 'M':
                case 'm':
                multi = numero1*numero2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: " +multi);
                break;
            case 'D':
                case 'd':
                if (numero2 == 0) {
                    JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
                }
                else{
                    division = numero1/numero2;
                    JOptionPane.showMessageDialog(null, "El resultado de la division es: " +division);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "***** ERROR, OPERACION INCORRECTA *****");
        }
    }
}
