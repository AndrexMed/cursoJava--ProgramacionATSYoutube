/*
Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
1. Ingresar dinero a la cuenta.
2. Retirar dinero de la cuenta.
3. Salir
 */
package Introduccion;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise9 {
    public static void main(String[] args) {
        final int saldo_inicial = 1000;
        int response;
         float ingreso,retiro,saldoActual = 0;
        
        response = Integer.parseInt(JOptionPane.showInputDialog("**** BIENVENIDO A SU CAJERO AUTOMATICO *****\n"
                + "1. Depositar\n"
                + "2. Retirar\n"
                + "3. Salir\n"));
        
        switch (response) {
            case 1:
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("***** DIGITE LA CANTIDAD A DEPOSITAR *****"));
                saldoActual = saldo_inicial + ingreso;
                JOptionPane.showMessageDialog(null, "***** SALDO ACTUAL: " + saldoActual);
                break;
                case 2:
                retiro = Float.parseFloat(JOptionPane.showInputDialog("***** DIGITE LA CANTIDAD A RETIRAR *****"));
                    if (retiro > saldo_inicial) {
                        JOptionPane.showMessageDialog(null, "***** FONDOS INSUFICIENTES *****");
                    } else {
                        saldoActual = saldo_inicial - retiro;
                        JOptionPane.showMessageDialog(null, "***** SALDO ACTUAL: " + saldoActual);
                    }
                break;
                case 3:             
                break;
            default:
                JOptionPane.showMessageDialog(null, "***** CORRIJA LA OPCION SELECCIONADA *****");
        }
    }
}
