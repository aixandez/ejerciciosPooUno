/* 5. Leer dos valores numericos enteros e informar cual es el mayor y cual es el menor,
Considerar que ambos valores son diferentes */ 

package ejerciciosLoo;

public class Ejercicio5Loo {
	
	public static void main (String[] args) {
        int a = 800;
        int b = 700;

        int mayor, menor;

        if (a < b) {
            mayor = b;
            menor = a;
        } else {
            mayor = a;
            menor = b;
        }

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }

}
