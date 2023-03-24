
public class forEach {
    public static void main(String[] args) {
        String nombres[] = {"Giovanni","Andres","Alzate","Agudelo","Julieta","Aleja","Madre","Padre"};
        String pruebados[] = {"hola","como","estas"};
        
        for (int i = 0; i < nombres.length; i++) { // Se utiliza para cuando hay muchos elementos dentro del arreglo
            System.out.println("los nombres son: "+nombres[i]);          
        }
        //
        System.out.println("prueba dos");
        for (int j = 0; j < pruebados.length; j++) {
            System.out.println("Los elementos del arreglo son: "+pruebados[j]);
        }
        //For Each o mejorado
        for(String j:pruebados){
            System.out.println("nombres: "+j);
        }
        
    }
}
