/*
Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
package Introduccion;

import java.util.Scanner;

/**
 *
 * @author giova
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, n3;

        System.out.println("Digite tres numeros: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        n3 = leer.nextInt();
        
        if (n1 > n2 && n2 > n3) {
            System.out.println("Orden de mayor a menor: " +n1+ "-" +n2+ "-" +n3);
        }
        else if (n1 > n3 && n3 > n2){
            System.out.println("Orden de mayor a menor: " +n1+ "-" +n3+ "-" +n2);
        }
        else if (n2 > n1 && n1 > n3){
            System.out.println("Orden de mayor a menor: " +n2+ "-" +n1+ "-" +n3);
        }
        else if (n2 > n3 && n3 > n1){
            System.out.println("Orden de mayor a menor: " +n2+ "-" +n3+ "-" +n1);
        }
        else if (n3 > n1 && n1 > n2){
            System.out.println("Orden de mayor a menor: " +n3+ "-" +n1+ "-" +n2);
        }
        else{
            System.out.println("Orden de mayor a menor: " +n3+ "-" +n2+ "-" +n1);
        }

    }

}
