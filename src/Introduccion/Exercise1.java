package Introduccion;

import java.util.Scanner;

/*Guillermo tiene N dolares. Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer un programa que calcule e imprama la cantidad de dinero que tienen los tres.*/
/**
 *
 * @author giova
 */
public class Exercise1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.println("Digite la cantidad de dinero que tiene Guillermo");
        guillermo = leer.nextFloat();
        
        luis = guillermo/2; // Luis tiene la mitad de lo de guillermo
        juan = (guillermo+luis)/2;
        
        total = guillermo+luis+juan;
        
        System.out.println("La cantidad de dinero entre los tres es: $" +total);      
    }
}
