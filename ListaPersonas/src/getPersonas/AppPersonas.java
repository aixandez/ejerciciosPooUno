package getPersonas;

import java.io.IOException;
import java.util.List;

public class AppPersonas {
	
	public static void main(String[] args) throws IOException {
		
		List<Persona> personas = LeerYescribirPersonas.getPersonas("personas.in");
		
		LeerYescribirPersonas.escribirMayoresDeEdadOrdenadasPorEdad(personas, 30);
		
		LeerYescribirPersonas.escribirMayoresDeEdadOrdenadasPorDNI(personas, 30);
		
	}

}
