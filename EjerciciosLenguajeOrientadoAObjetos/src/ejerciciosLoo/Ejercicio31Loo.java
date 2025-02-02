/* 31. Escribir una función que reciba un arreglo de enteros y devuelva la suma de los elementos que se encuentran en posiciones pares
(incluido el elemento de la posición 0). Por ejemplo: Dado el arreglo [1, 2, 13 ,4, 8, 6] => devuelve 22 (1+13+8) */

package ejerciciosLoo;

public class Ejercicio31Loo {
	
	public static void main(String[] args) {
        int[] a = { 3, 6, 7, 9, 2, 4 };
        int[] b = new int[10];

        for (int i = 0; i < b.length; i++) {
            b[i] = i * 10;
        }

        elementosEnPosPares(a);
        elementosEnPosImpares(b);
    }

    static void elementosEnPosPares(int[] enteros) {

        for (int i = 0; i < enteros.length; i += 2) {
            // if (i % 2 == 0) {
            System.out.println(enteros[i]);
            // }
        }
    }

    static void elementosEnPosImpares(int[] enteros) {

        for (int i = 1; i < enteros.length; i += 2) {
            System.out.println(enteros[i]);
        }

    }

}
