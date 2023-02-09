import java.util.Scanner;

public class primero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Menú de opciones:");
            System.out.println("1. Imprimir contenido de arreglo de enteros(punto 1 y 4)");
            System.out.println("2. Imprimir contenido de arreglo de nombres(punto 2 y 5)");
            System.out.println("3. Imprimir contenido de arreglo de estudiantes(punto 3)");
            System.out.println("4. Imprimir método para mostrar los contenidos de un arreglo(punto 6)");
            System.out.println("5. Buscar valor en arreglo de enteros(punto 7)");
            System.out.println("6. Eliminar valor en arreglo de enteros(punto 8)");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    mainMethod1();
                    break;
                case 2:
                    mainMethod2();
                    break;
                case 3:
                    mainMethod3();
                    break;
                case 4:
                    mainMethod4();
                    break;
                case 5:
                    mainMethod5();
                    break;
                case 6:
                	int[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
                    int valueToRemove = 5;//Escribe un método para eliminar un valor en un arreglo(aqui se pone el valor a eliminar) 
                    arrayEnteros = removeValue(arrayEnteros, valueToRemove);
                    System.out.println("Arreglo después de eliminar el valor " + valueToRemove + ":");
                    printArray(arrayEnteros);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    return;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }
    }

    public static void mainMethod1() {
        int[] arrayEnteros = new int[15];//Declara un arreglo de 15 enteros.

        arrayEnteros[9] = 5;//Asigna un valor de 5 a la décima posición en el arreglo declarado que guarda enteros.

        System.out.println("Contenido del arreglo de enteros:");
        printArray(arrayEnteros);
    }

    public static void mainMethod2() {
        String[] nombres = new String[20];//Declara un arreglo que guarde 20 nombres.

        nombres[0] = "Francisco";//Inserta "Francisco" en la primer posición del arreglo declarado para guardar nombres.
        
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre " + i + ": " + nombres[i]);
          }
        }
      
	public static void mainMethod3() {
		Estudiante[] estudiantes = new Estudiante[100];//Declara un arreglo de 100 objetos de la clase Estudiante.
		for (int i = 0; i < estudiantes.length; i++) {//todo esto es llamado de la clase Estudiante
		estudiantes[i] = new Estudiante(null, i);
		}
		System.out.println("Contenido del arreglo de estudiantes:");
		printArray(estudiantes);
		}
		public static void printArray(Estudiante[] array) {
		for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
		}
		}

    // Método 4
    public static void mainMethod4() {
    	 int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
	        printArray(array);
	    }
	    
	    public static void print1Array(int[] array) {//Escribe un método para mostrar los contenidos de un arreglo.
	        for (int i = 0; i < array.length; i++) {
	            System.out.print(array[i] + " ");
	        }
	        System.out.println();
	    }
	
    public static void mainMethod5() {
        int[] arrayEnteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};//Escribe un método para buscar un valor en el arreglo.

        int valueToSearch = 9;//para buscar el valor dependiendo del tamaño del arreglo (inserta el valor que se busca en la posicion)
        int index = searchArray(arrayEnteros, valueToSearch);
        if (index != -1) {
            System.out.println("El valor " + valueToSearch + " se encuentra en el índice " + index + " del arreglo.");
        } else {
            System.out.println("El valor " + valueToSearch + " no se encuentra en el arreglo.");
        }
    }
//metodo 6
    public static int searchArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] removeValue(int[] array, int value) {// (primero busca el valor y eliminalo moviendo los otros valores para cubrir el espacio).
        int index = searchArray(array, value);
        if (index == -1) {
            return array;
        }
        int[] result = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }
}
