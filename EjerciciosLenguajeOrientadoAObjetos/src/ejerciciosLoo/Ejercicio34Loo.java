/* 34. Escribir una función que reciba dos arreglos a1 y a2, de enteros ordenados de menor a mayor
 * e intercale los elementos de los arreglos que recibe en un nuevo arreglo,
 * tal que el arreglo resultante también esté ordenado. Por ejemplo:

a1 = [-5, 0, 0, 1, 5]
a2 = [-10, 0, 7]
resultado = [-10, -5, 0, 0, 0, 1, 5, 7] */

package ejerciciosLoo;

public class Ejercicio34Loo {
	
	static int[] mezcla(int[] a, int[] b) {
        int[] resultado = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                resultado[k] = a[i];
                i++;
            } else {
                resultado[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            while (j < b.length) {
                resultado[k] = b[j];
                k++;
                j++;
            }
        } else {
            while (i < a.length) {
                resultado[k] = a[i];
                k++;
                i++;
            }
        }
        return resultado;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 3, 5, 7 };

        int[] resultado = mezcla(b, a);
        for (int r : resultado)
            System.out.print(r + " ");

    }

}
