package productosLista;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void cargarProductos(String archivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(archivo));
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] datos = linea.split(",");
            String nombre = datos[0];
            double precio = Double.parseDouble(datos[1]);
            int stock = Integer.parseInt(datos[2]);

            // Comprobar si el producto ya existe en la lista
            boolean existe = false;
            for (Producto p : productos) {
                if (p.getNombre().equals(nombre)) {
                    p.agregarStock(stock);
                    existe = true;
                    break;
                }
            }

            // Si el producto no existe, lo añadimos a la lista
            if (!existe) {
                productos.add(new Producto(nombre, precio, stock));
            }
        }
        br.close();
    }

    public void mostrarInventario() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto.getNombre() +
                               ", Precio: " + producto.getPrecio() +
                               ", Stock: " + producto.getStock());
        }
    }
}
