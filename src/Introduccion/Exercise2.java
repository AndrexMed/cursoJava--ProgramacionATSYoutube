/*
La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos de su rendimiento académico: 
participación, primer examen parcial, segundo examen parcial y examen final.
Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 10%, 25%, 25% y 40%, 
Hacer un programa que calcule e imprima la calificación final obtenida por un estudiante.
 */
package Introduccion;

import java.util.Scanner;

/**
 *
 * @author giova
 */
public class Exercise2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float participacion,primerExamen,segundoExamen,examenFinal,notaFinal;
        
        //Pedir los datos necesarios
        System.out.println("Digite la nota de participacion");
        participacion = leer.nextFloat();
        System.out.println("Digite la nota del primer examen parcial");
        primerExamen = leer.nextFloat();
        System.out.println("Digite la nota del segundo examen parcial");
        segundoExamen = leer.nextFloat();
        System.out.println("Digite la nota del examen final");
        examenFinal = leer.nextFloat();
        
        //Sacamos los calculos
        participacion *=  0.10f; // participacion = participacion * 0.10f; 
        primerExamen *=  0.25f;
        segundoExamen *= 0.25f;
        examenFinal *= 0.40f;
        
        //Sumamos las notas
        notaFinal = participacion + primerExamen + segundoExamen + examenFinal;
   
        System.out.println("La nota final es: " + notaFinal);
    }
}
