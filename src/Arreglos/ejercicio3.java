
import java.util.Scanner;

/*
Ejercicio 5: Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: 
el 1º de A, el 1ºde B, el 2º de A, el 2º de B, etc.
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a[],b[],c[];   //Declaracion de arreglos
        a = new int [10];
        b = new int [10];
        c = new int [20]; // el arreglo c contendra al arreglo a y b
        
        System.out.println("Digite el arreglo a");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+".Ingrese el numero: ");
            a[i]=leer.nextInt();
        }
        System.out.println("\nDigite el arreglo b");
        for (int i = 0; i < 10; i++) {
            System.out.print((i+1)+"ingrese el numero: ");
            b[i]=leer.nextInt();
        }
        //ahora vamos a mezclar los dos arreglos
        // vamos a utilizar el iterador i para ayb
        //y el iterado j para el arreglo c
        int j=0;
        for (int i = 0; i < 10; i++) {
            c[j]=a[i]; //1°A -- elemento del arreglo en posicion 0 del arreglo a
            j++;
            c[j]=b[i]; // 1°B -- elemento del arreglo y empieza en la posicion 0
            j++;
        }
        System.out.println("\nel tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(c[i]+" ");
        }
        System.out.println();
    }
    
}
