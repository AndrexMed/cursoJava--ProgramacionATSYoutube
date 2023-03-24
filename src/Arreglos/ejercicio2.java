
import java.util.Scanner;

// Leer 10 números por teclado, almacenarlos en un arreglo y a continuación realizar la promemedio de los números
//positivos, la media de los negativos y conteo de número ceros.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float[] media = new float [10]; // declaramos el array
        float sumapos=0,sumaneg=0,mediapos,medianeg;
        int contpos=0,contneg=0,contneu=0;
        
        //insertamos datos en el array
        System.out.println("Ingrese los numeros para el arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            media[i]=leer.nextFloat();
            
            if (media[i] == 0) {
                contneu++;
            }
            else if (media[i] > 0){
                sumapos = sumapos + media[i];
                contpos++;
            }
            else{
                sumaneg = sumaneg + media[i];  // sumaneg += media[i]; es lo mismo
                contneg++;
            }
        }
        
        //media de los positivos
        if (contpos == 0) {
            System.out.println("No se encontro ningun numero positivo");
            
        }else{
            mediapos=sumapos/contpos;
            System.out.println("la media los numeros positivos es: "+mediapos);
        }
        //media los numeros negativos
        if (contneg==0) {
            System.out.println("No se encontro ningun numero negativo");
        } else {
            medianeg=sumaneg/contneg;
            System.out.println("la media de los negativos es: "+medianeg);
        }
        System.out.println("cantidad de ceros es: "+contneu);
        
    }
}
