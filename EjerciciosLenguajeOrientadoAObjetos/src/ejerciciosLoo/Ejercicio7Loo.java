/* 7. Leer un valor númerico que represente un día de la semana.
Se pide mostrar por pantalla el nombre del día considerando que:
el día 1 es el lunes, el día 2 es el martes y así sucesivamente. */

package ejerciciosLoo;

import java.util.Scanner;

public class Ejercicio7Loo {
	
	public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un día de la semana de forma numérica: ");
        int diaNumerico = sc.nextInt();

        switch (diaNumerico) {
            case 1:
                System.out.println("El día de la semana es: Lunes");
                break;
            case 2:
                System.out.println("El día de la semana es: Martes");
                break;
            case 3:
                System.out.println("El día de la semana es: Miércoles");
                break;
            case 4:
                System.out.println("El día de la semana es: Jueves");
                break;
            case 5:
                System.out.println("El día de la semana es: Viernes");
                break;
            case 6:
                System.out.println("El día de la semana es: Sábado");
                break;
            case 7:
                System.out.println("El día de la semana es: Domingo");
                break;
            default:
                System.out.println("El día es inválido. Ingrese un valor del 1 al 7.");
        }

        sc.close();
    }

}
