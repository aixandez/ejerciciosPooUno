package cuentasBancarias;

public abstract class Cuenta {
	
	private int dni;
	private double saldo;
	
	public Cuenta(int dni) {
		this.dni = dni;
		this.saldo = 0;
	}
	
	protected void setSaldo(double saldo) { // solo es visible para las clases hijas 
		this.saldo = saldo;
	}
	
	public void depositar(double monto) {
		if(monto <= 0) {
			throw new Error("Monto invalido");
		}
		this.saldo += monto;
	}
	
	public abstract void extraer(double monto); /* tengo que extraer dinero pero no se cómo hacerlo, por eso es abstracto y sin las llaves */

	public abstract double getDineroDisponible();
	
	public void transferir(Cuenta destino, double monto) {
		if (monto <= 0) {
			throw new Error("Monto invalido");
		}
		this.extraer(monto);
		this.depositar(monto);
	}

	@Override
	public String toString() {
		return "Cuenta [dni=" + dni + ", saldo=" + saldo + "]"; /* clase, nombre del atributo, valor del atributo */
	}

	public int getDni() {
		return dni;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
