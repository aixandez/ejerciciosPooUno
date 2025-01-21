/* 28. FizzBuzz: Imprimir por pantalla los números del 1 al 100 pero considerando lo siguiente:
a) Si el número es divisible por 3 se debe imprimir "Fizz".
b) Si el número es divisible por 5 se debe imprimir "Buzz".
c) Si el número es divisible por 3 y por 5 se debe imprimir "FizzBuzz". */

package ejerciciosLoo;

public class Ejercicio28Loo {
	
	public static void main(String[] args) {

        for(int i = 1; i <= 100; i++) {
            
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}
