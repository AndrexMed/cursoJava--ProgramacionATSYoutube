/*
Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años,
y la cantidad de alumnos que miden más de 1.75.
 */
package Bucles;

import javax.swing.JOptionPane;

/**
 *
 * @author giova
 */
public class Exercise7 {
    public static void main(String[] args) {
        int edad,sumaEdades=0,count18=0,countAlt=0;
                float altura,sumaAlt=0,mediaEdades,mediaAlt;
                
                for (int i = 0; i < 5; i++) {
                    edad = Integer.parseInt(JOptionPane.showInputDialog("ALUMNO #"+(i+1)+" DIGITE SU EDAD: "));
                    altura = Float.parseFloat(JOptionPane.showInputDialog("ALUMNO #"+(i+1)+" DIGITE SU ALTURA: "));
                    
                    sumaEdades = sumaEdades + edad; //Suma iterativa de edades
                    sumaAlt += altura;  //Suma iterativa de la altura
                    
                    if (edad > 18) {
                        count18++;
                    }
                    if (altura > 1.75) {
                        countAlt++;
                    }
        }
                mediaEdades = (float)sumaEdades / 5;
                mediaAlt = (float)sumaAlt / 5;
                
                System.out.println("***** LA EDAD PROMEDIO ES: "+mediaEdades);
                System.out.println("***** LA ESTATURA PROMEDIO ES: "+mediaAlt);
                System.out.println("***** CANTIDAD DE ALUMNOS MAYORES DE 18: "+count18);
                System.out.println("*****CANTIDAD DE ALUMNOS QUE MIDEN + DE 1.75: "+countAlt);
    }
}
