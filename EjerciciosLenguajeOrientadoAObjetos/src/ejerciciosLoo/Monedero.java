package ejerciciosLoo;

public class Monedero {
	
	private double dinero; // double: número con decimal

    public Monedero(double dineroInicial){
        dinero = dineroInicial;
    }

    public double sacarDinero(double cantidadAsacar){
        if(dinero >= cantidadAsacar){
            dinero -=cantidadAsacar;
            return cantidadAsacar;
        }
        else
            return 0;
    }

    public void ponerDinero(double dineroAingresar) {
        dinero += dineroAingresar;
    }
    public double verCuantoDineroHay() {
        return dinero;
    }    

    public static void main(String[] args) {
        Monedero miMonederoRosa = new Monedero(1000);
        double disponible = miMonederoRosa.verCuantoDineroHay();
        System.out.println(disponible);
        miMonederoRosa.sacarDinero(300);
        disponible = miMonederoRosa.verCuantoDineroHay();
        System.out.println(disponible);
        miMonederoRosa.ponerDinero(100);
        disponible = miMonederoRosa.verCuantoDineroHay();
        System.out.println(disponible);
        miMonederoRosa.sacarDinero(800);
        disponible = miMonederoRosa.verCuantoDineroHay();
        System.out.println(disponible);

        Monedero otroMonedero = new Monedero(100);
        System.out.println(otroMonedero.verCuantoDineroHay());
        
    }

}
