/* 4. Se ingresa un valor numérico de 8 dígitos que representa una fecha con el siguiente formato aaaammdd.
Se pide informar por separado el día, el mes y el año de la fecha ingresada. */

package ejerciciosLoo;

public class Ejercicio4Loo {
	
	public static void darVueltaLaFecha(int fecha) {

        int dia;
        int mes;
        int anio;

        anio = fecha / 10000;
        dia = fecha % 100;
        mes = fecha / 100 % 100;

        System.out.println("dia " + dia + ", mes " + mes + ", año " + anio + ".");
    }

    public static void main(String[] args) {

        darVueltaLaFecha(20240813);
    }

}
