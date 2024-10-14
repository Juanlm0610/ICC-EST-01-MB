public class MetodosBusqueda {

    public int busquedaSecuencial(int[] arreglo, int valorBuscar) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscar) {
                return i;
            }
        }
        return -1;
    }

    public void printArreglo(int[] arreglo) {
        for (int elem : arreglo) {
            System.out.print(elem + " ");
        }
    }

    public int busquedaBinaria(int[] arr, int value) {
        int inicio = 0;
        int fin = arr.length - 1;
        int cont = 0; // Inicializar el contador de iteraciones
        long starttime = System.nanoTime();
        
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arr[medio] == value) {
                long endtime = System.nanoTime(); 
                System.out.println("Tiempo de Ejecución: " + (endtime - starttime) + " nanosegundos");
                // Elemento encontrado, mostrar el número de iteraciones
                System.out.println("Se realizaron " + cont + " iteraciones");
                return medio;
            }
            
            if (arr[medio] < value) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
            cont++; 
        }
        
       
        long endtime = System.nanoTime(); // Registrar el tiempo de fin si no se encuentra el valor
        System.out.println("Tiempo de Ejecución: " + (endtime - starttime) + " nanosegundos");
        System.out.println("Con el Método Binario se realizaron " + cont + " iteraciones");
        return -1;
    }
}
