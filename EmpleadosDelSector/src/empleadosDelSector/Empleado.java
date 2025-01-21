package empleadosDelSector;

public class Empleado {

    private int sector;
    private int legajo;
    private String apenom;
    private int antiguedad;

    public Empleado(int sector, int legajo, String apenom, int antiguedad) {
        this.sector = sector;
        this.legajo = legajo;
        this.apenom = apenom;
        this.antiguedad = antiguedad;
    }

    public int getSector() {
        return sector;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getApenom() {
        return apenom;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    @Override
    public String toString() {
        return " [" + "legajo=" + legajo + ", apenom=" + apenom + ", antiguedad=" + antiguedad + "]";
    }

}
