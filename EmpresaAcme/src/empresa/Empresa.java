package empresa;

public class Empresa {
	
	private Empleado empleados[]; /* array de empleados */
	private int cantEmpleados;
	private int posicion = 0;

	public Empresa(int cantEmpleados) { /* constructor, inicializamos la cantidad de empleados */
		this.empleados = new Empleado[cantEmpleados]; /* construimos el array */
		this.cantEmpleados = cantEmpleados;
	}
	
	public void agregarEmpleado(Empleado e) {
		if (posicion < this.cantEmpleados) {
			this.empleados[posicion] = e;
			posicion++; /* si hay lugar, agrega un empleado */
		}
		else
			throw new Error("No hay más lugar");
	}
	
	public double montoTotal() {
		double totalSueldos = 0;
		
		for (int i = 0; i < posicion; i++) {
			totalSueldos += empleados[i].getSalario();
		}
		return totalSueldos;
	}
}