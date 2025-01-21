package empresa;

public class PlantaTemporaria extends Empleado {
	private static double VALOR_HORA = 2000;
	
	public PlantaTemporaria(int horasTrabajadas, int cantHijos, boolean casado) { /* constructor */
		super(horasTrabajadas, cantHijos, casado); /* invoca al constructor de la superclase */
	}

	@Override /* sobreescribo el método getsalario para un empleado de planta temporaria */
	public double getSalario() {
		return super.getHorasTrabajadas() * 
				PlantaTemporaria.VALOR_HORA + 
				super.getSalarioFamiliar();
		
	}

}
