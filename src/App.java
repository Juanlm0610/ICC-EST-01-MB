import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        int[] arreglo = new int[100000]; 
        for(int i = 0; i < 100000; i++){
            arreglo[i] = i + 1;
        }

        int[] arr = new int[100000]; 
        for(int i = 0; i < 100000; i++){
            arreglo[i] = i + 1;
        }
        metodosBusqueda.printArreglo(arreglo);

        int posicion = metodosBusqueda.busquedaBinaria(arr, 50418);

        if (posicion != -1) {
            System.out.println("Con el metodo Binario El valor se encuentra en la posicion " + posicion);
        } else {
            System.out.println("Valor no encontrado 404");
        }


        int posicion1 = metodosBusqueda.busquedaSecuencial(arreglo, 50418);

        if (posicion1 != -1) {
            System.out.println("Con el metodo Secuencial El valor se encuentra en la posicion " + posicion1);
            System.out.println("Se realizaron " + (posicion1+1) + " iteraciones.");
        } else {
            System.out.println("Valor no encontrado 404");
        }
    }
}

