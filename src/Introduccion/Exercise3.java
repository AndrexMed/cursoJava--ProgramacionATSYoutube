/*
Construir un programa que, dado un número total de horas, devuelve el número de semanas, días y horas  equivalentes. Por ejemplo, 
dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
 */
package Introduccion;

import java.util.Scanner;

/**
 *
 * @author giova
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int horasTotales, semanas, dias, horas;
        
        System.out.println("Digite el numero de horas: ");
        horasTotales = leer.nextInt();
        
        semanas = horasTotales / 168; // 168 equivale a las horas de una semana
        dias = horasTotales % 168 / 24; //Necesitamos el resto de horas para sacar los dias entre 24
        horas = horasTotales % 24;
        
        System.out.println("El equivalente es: ");
        System.out.println("Semanas: " + semanas);
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " +horas);
    }
}
