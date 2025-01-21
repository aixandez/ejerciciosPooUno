package getPersonas;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LeerYescribirPersonas {
	
	public static LinkedList<Persona> getPersonas(String archivo) {
		LinkedList<Persona> personas = new LinkedList<Persona>();
		Scanner sc = null;
		try {
			sc = new Scanner(new File(archivo));
			
			while (sc.hasNext()) {
				// leo cada linea del archivo
				String linea = sc.nextLine();
				String datos [] = linea.split(" ");
				// creo una Persona a partir de los datos leidos de la linea
				int dni = Integer.parseInt(datos[0]);
				String apellido = datos[1];
				int edad = Integer.parseInt(datos[2]);
				// agrego a esa persona a la lista, siempre y cuando no esté repetida
				Persona p = new Persona(dni, apellido, edad);
				
				if (!personas.contains(p)) // contains me dice si el objeto está o no en la lista
					personas.add(p);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// cierro el archivo
		sc.close();
		
		return personas; // devuelvo la lista de personas
	}
	
	// comparadores, los tres métodos que ordenan:
	
	public static void ordenarPersonasPorDNI(List<Persona> lista) {
		Collections.sort(lista, new DniComparator());
	}
	
	public static void ordenarPersonasPorApellido(List<Persona> lista) {
		Collections.sort(lista, new ApellidoComparator());
	}
	
	public static void ordenarPersonasPorEdad(List<Persona> lista) {
		Collections.sort(lista, new EdadComparator());
	}
	
	public static List<Persona> getPersonasMayoresDeEdad(List<Persona> personas, Integer edad) {
		// LinkedList<Persona> personasMayores = new LinkedList<Persona();
		List<Persona> personasMayores = new ArrayList<Persona>();
		
		for (Persona cu : personas)
			if (cu.getEdad() > edad)
				personasMayores.add(cu);
		
		return personasMayores;
	}
	
	public static void escribirPersonas(List<Persona> personas, String file) throws IOException {
		
		PrintWriter salida = new PrintWriter(new FileWriter(file));
		
		for (Persona persona : personas) {
			salida.println(persona);
		}
		salida.close();
	}

	public static void escribirMayoresDeEdadOrdenadasPorDNI(List<Persona> personas, int edad)
			throws IOException {
		
		List<Persona> personasMayores = getPersonasMayoresDeEdad(personas, edad);
		ordenarPersonasPorDNI(personasMayores);
		escribirPersonas(personasMayores, "MayoresDe"+edad+"OrdenadosPorDNI"+".csv");
		// csv: separa por coma
		
	}
	
	public static void escribirMayoresDeEdadOrdenadasPorEdad(List<Persona> personas, int edad)
			throws IOException {
		
		List<Persona> personasMayores = getPersonasMayoresDeEdad(personas, edad);
		ordenarPersonasPorEdad(personasMayores);
		escribirPersonas(personasMayores, "MayoresDe"+edad+"OrdenadosPorDNI"+".csv");
		// csv: separa por coma
		
	}
	
	public static Map<Integer, ArrayList<Persona>> agruparPorEdad(List<Persona> personas) {
		
		Map<Integer, ArrayList<Persona>> personasPorEdad = new TreeMap<Integer, ArrayList<Persona>>();
		ArrayList<Persona> aux;
		for (Persona cadaPersona : personas) {
			Integer key = cadaPersona.getEdad();
			
			if (personasPorEdad.containsKey(key)) {
				aux = personasPorEdad.get(key);
				
			} else {
				aux = new ArrayList<Persona>();
			}
			
			aux.add(cadaPersona);
			personasPorEdad.put(key, aux);
		}
		
		return personasPorEdad;
		
		
	}
}
