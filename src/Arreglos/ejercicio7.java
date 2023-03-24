/*
Ejercicio 13: Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos
impares.
*/

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int [] arreglo = new int [10];
        int contpar=0,contimpar=0;
        System.out.println("Digite los datos para el arreglo"); // llenando el arreglo
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero: "+(i+1));
            arreglo[i]=leer.nextInt();
            
            if (arreglo[i]%2==0) { // comprobamos si el numero es par
                contpar++;         //guardamos cada numero par en una variable
            } else {
                contimpar++;
            }
        }
        
        //Creamos los arreglos para los numeros pares e impar
        int par[] = new int [contpar];
        int impar [] = new int [contimpar];
        contpar=0;
        contimpar=0;
        
        for (int i = 0; i < 10; i++) {
            if (arreglo[i]%2==0) { //si el numero ees par
                par[contpar] = arreglo [i];
                contpar++;
            } else {
                impar[contimpar] = arreglo [i];
                contimpar++;
            }
        }
        
        System.out.println("Arreglo pares");
        for (int i = 0; i < contpar; i++) {
            System.out.println(par[i]+" - ");
        }
        System.out.println("");
        
        System.out.println("Arreglo impares");
        for (int i = 0; i < contimpar; i++) {
            System.out.println(impar[i]+" - ");
        }
        System.out.println("");
    }
}
