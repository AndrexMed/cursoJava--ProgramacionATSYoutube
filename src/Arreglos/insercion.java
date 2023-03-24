import java.util.Scanner;
public class insercion {
    public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        int n,pos,aux;
        System.out.println("Ingrese un numero N de datos numericos");
        n=leer.nextInt();
        int [] datos = new int [n];
        System.out.println("Rellene el arreglo de numeros");
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            datos[i]=leer.nextInt();
        }
        //metodo insercion
        for (int i = 0; i < n; i++) {
            pos = i;
            aux = datos[i];  // numero del arreglo que vamos comprobando
            
            while ((pos > 0 ) && (datos[pos-1] > aux)) {
                datos[pos] = datos[pos-1];  //Aqui se hace el cambio, el num actual paasa a la posicion -1
                pos--;
            }
            datos[pos] = aux;
        }
        System.out.println("Datos en orden creciente:");
        for (int i = 0; i < n; i++) {
            System.out.println(datos[i]+" - ");
        }
        
        System.out.println("Orden de-creciente:");
        for (int i = (n-1); i >= 0; i--) {
            System.out.println(datos[i]+" - ");
        }
        
        
    }
}
