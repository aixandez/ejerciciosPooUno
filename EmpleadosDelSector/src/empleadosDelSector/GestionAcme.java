package empleadosDelSector;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GestionAcme {

    Map<Integer, List<Empleado>> leerArchivoDePersonal(String entrada) throws IOException {
        Map<Integer, List<Empleado>> aux = new HashMap<Integer, List<Empleado>>();

        FileReader fr = new FileReader(new File(entrada));
        BufferedReader br = new BufferedReader(fr);
        List<Empleado> le;

        String linea = br.readLine();
        while (linea != null) {
            String datos[] = linea.split(",");
            try {
                int sector = Integer.parseInt(datos[0]);
                if (sector < 100 || sector > 300)
                    throw new SectorIncorrectoException();
                int legajo = Integer.parseInt(datos[1]);
                String apenom = datos[2];
                int antiguedad = Integer.parseInt(datos[3]);
                Empleado e = new Empleado(sector, legajo, apenom, antiguedad);
                // guardo en el mapa
                // if (aux.containsKey(sector)) {
                // le = aux.get(sector);
                // } else {
                // le = new LinkedList<Empleado>();
                // }
                // le.add(e);

                le = aux.getOrDefault(sector, new LinkedList<Empleado>());
                le.add(e);
                aux.put(sector, le);

            } catch (NumberFormatException nfe) {
                System.err.println("Uno de los datos no es correcto");
            } catch (SectorIncorrectoException sie) {
                System.err.println("Sector incorrecto");
            }

            linea = br.readLine();
        }

        fr.close();

        return aux;

    }

    /**
     * 
     * @param sector
     * @param empleados
     *                  que genere el archivo “empleadosDelSectorXXX.csv”
     *                  (XXX representa el sector pedido).
     * @throws IOException
     */
    void listarEmpleadosDelSector(int sector, Map<Integer, List<Empleado>> empleados) throws IOException {
        String salida = "empleadosDelSector" + sector + ".csv";
        PrintWriter pr = new PrintWriter(new FileWriter(salida));

        List<Empleado> le = empleados.get(sector);
        try {
            pr.println("Empleados del Sector: " + sector);
            for (Empleado empleado : le) {
                pr.println(empleado);
            }
        } catch (NullPointerException npe) {
            pr.println("Sector sin empleados");
            System.err.println("Sector sin empleados");
        }

        pr.close();
    }

    public static void main(String[] args) throws IOException {
        GestionAcme ga = new GestionAcme();
        Map<Integer, List<Empleado>> exsec = new TreeMap<>();
        exsec = ga.leerArchivoDePersonal("personal.csv");
        ga.listarEmpleadosDelSector(110, exsec);

    }

}
