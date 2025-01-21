package tiendaMinorista;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.util.Map;
import java.util.TreeMap;

public class ComprasManager {
	
	private Map<String, Double> paraAsociar = new TreeMap<String, Double>();
	
	public ComprasManager() {
		
	}
	
	// Método para leer las compras
	public void leerCompras(String entrada) throws IOException {
	    FileReader fr = new FileReader(new File(entrada));
	    BufferedReader br = new BufferedReader(fr);
	    
	    String key;
	    Double value;
	    String[] datos;
	    
	    String linea = br.readLine();
	    while (linea != null) {
	        datos = linea.split(" "); // Divide la línea en ID y monto
	        
	        try {
	            key = datos[0]; // ID del cliente
	            value = Double.parseDouble(datos[1]); // Monto gastado
	            
	            if (paraAsociar.containsKey(key)) {
	                // Sumar al total existente
	                value += paraAsociar.get(key);
	            }
	            
	            // Actualizar o insertar en el mapa
	            paraAsociar.put(key, value);
	            
	        } catch (NumberFormatException nfe) {
	            System.err.println("Error en el formato del monto: " + datos[1]);
	        } catch (ArrayIndexOutOfBoundsException aioobe) {
	            System.err.println("Error: Línea mal formada -> " + linea);
	        }
	        
	        linea = br.readLine(); // Leer la siguiente línea
	    }
	    
	    br.close();
	    fr.close();
	}
	
	public void escribirTotalesPorCliente(String salida) throws IOException {
	    PrintWriter pw = new PrintWriter(new FileWriter(salida));
	    
	    pw.println("Totales por cliente");
	    for (Map.Entry<String, Double> entry : paraAsociar.entrySet()) {
	        pw.println(entry.getKey() + " " + entry.getValue());
	    }
	    
	    pw.close();
	}

	public static void main(String[] args) throws IOException {
	    ComprasManager manager = new ComprasManager();
	    
	    // Leer el archivo de entrada
	    manager.leerCompras("comprasDiarias.in");
	    
	    // Escribir el archivo de salida
	    manager.escribirTotalesPorCliente("totalesPorCliente.out");
	}



}
