package ponyExpress;

public class PonyExpress {

    private int[] distancias;

    public PonyExpress(int[] distancias) {
        this.distancias = distancias;
    }

    public int caballos() {

        int cantCaballos = 1;
        int acumuDist = 0;

        for (int index = 0; index < distancias.length; index++) {

            int distancia = distancias[index];

            if (distancia > 100) {
                throw new Error("distancia no valida");
            }

            if (acumuDist + distancia > 100) {
                cantCaballos++;
                acumuDist = distancia;
            } else {
                acumuDist += distancia; 
            }

            System.out.println("\nacumulado: " + acumuDist + " millas, caballos: " + cantCaballos);
        }

        return cantCaballos;
    }

}