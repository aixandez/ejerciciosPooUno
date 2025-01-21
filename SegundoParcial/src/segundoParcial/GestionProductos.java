package segundoParcial;

import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.io.File;
import java.util.List;
import java.util.Map;

public class GestionProductos {
	
	private Map <String, List<Producto>> ventas;
	
	public GestionProductos() {
		this.ventas = new TreeMap <String, List<Producto>>();
	}
	
	public void leerArchivo(String entrada) throws IOException{
		
		FileReader fr = new FileReader(new File(entrada));
		BufferedReader br = new BufferedReader(fr);
		
		String linea;
		String [] datos;
		String descripcion;
		String categoria;
		Double precio;
		Integer stock;
		List<Producto> lista;
		
		linea = br.readLine();
		
		while (linea != null) {
			datos = linea.split(",");
			descripcion = datos[0];
			categoria = datos[1];
			precio = Double.parseDouble(datos[2]);
			stock = Integer.parseInt(datos[3]);
			
			
			// Crear un nuevo producto
			Producto producto = new Producto(descripcion, categoria, precio, stock);

			// Verifica si la categoría ya está en el mapa
			if (ventas.containsKey(categoria)) {
			    lista = ventas.get(categoria);
			} else {
			    lista = new LinkedList<>();
			}

			// Agrega el producto a la lista y actualiza el mapa
			lista.add(producto);
			ventas.put(categoria, lista);

		}
		
		br.close();
		fr.close();
		
	}
	
	// Método que permite retornar el mapa procesado
	
	public Map<String, List<Producto>> getProductosPorCategoria() {
	    return this.ventas;
	}


}
