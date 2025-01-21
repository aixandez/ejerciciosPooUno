/* 20. Determinar si un carácter es una letra (función esLetra(char c)). */

package ejerciciosLoo;

public class Ejercicio20Loo {
	
	public static boolean esLetra(char c) {

		return (c >= 65 && c <= 90) || (c >= 97 && c <= 122);

	}

}
