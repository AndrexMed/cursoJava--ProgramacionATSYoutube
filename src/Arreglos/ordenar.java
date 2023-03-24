import java.util.Scanner;
public class ordenar {
    public static void main (String[]args){
        Scanner leer = new Scanner (System.in);
        int elementos;
        System.out.println("Ingrese un numero N de elementos");
        elementos=leer.nextInt();
        int [] arreglo = new int [elementos];
        
        System.out.println("Ingrese datos numericos en el arreglo");
        for (int i = 0; i < elementos; i++) {
            System.out.println("Ingrese el numero "+(i+1));
            arreglo[i]=leer.nextInt();
        }
        
        //metodo burbuja                        //el primer ciclo contara el numero de vueltas
        for (int i = 0; i < (elementos-1) ; i++) {//se coloca -1, para que no choquen los señaladores
            for (int j = 0; j < (elementos-1); j++) {  // este ciclo organizara los numeros
                if (arreglo[j] > arreglo[j+1]) {    // si numeroActual > numeroSiguiente  -- solo si entra a la condic..
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j+1];   // al numero actual le agregamos el valor del numero sgte
                    arreglo[j+1] = aux;
                }
            }
        }
        
        //imprimir numeros ordenados en creciente
        System.out.println("Numeros en orden creciente");
        for (int i = 0; i < elementos; i++) {
            System.out.print(arreglo[i]+" - ");
        }
        System.out.println("");
        
        //imprimir en orden decreciente
        System.out.println("numeros en orden decreciente");
        for (int i = (elementos-1); i >= 0; i--) {
            System.out.print(arreglo[i]+" - ");
        }
        
    }
}
