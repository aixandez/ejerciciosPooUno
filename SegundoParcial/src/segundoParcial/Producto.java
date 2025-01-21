package segundoParcial;

public class Producto {

    private String descripcion;
    private String categoria;
    private double precio;
    private int stock;

    public Producto(String descripcion, String categoria, double precio, int stock) {
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

}