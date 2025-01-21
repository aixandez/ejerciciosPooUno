package cuentasBancarias;

import java.util.ArrayList;

public class Banco { /* no extiende de nada, contiene datos de las cuentas */
	
	ArrayList<Cuenta> cuentas; /* defino un array */
	
	public Banco() {
		this.cuentas = new ArrayList<Cuenta>(); /* constructor */
	}
	
	public CuentaCorriente abrirCuentaCorriente(int dni, double descubierto){
		return new CuentaCorriente(dni, descubierto);
	}
	public CajaAhorro abrirCajaDeAhorro(int dni){
		return new CajaAhorro(dni);
	}
	
	public void agregarCuenta(Cuenta c){
		this.cuentas.add(c); /* agrego una cuenta, y este método lo agrega a mi lista de cuentas.
		agregarCuentas puede recibir cuentas corrientes, o cajas de ahorro, o sea de cualquier tipo. método POLIMORFO*/
	}
	
	public void listarCuentas() {
		for (Cuenta cadaCuenta : cuentas) {
			System.out.println(cadaCuenta);
		} /* for each que por cada lista de cuentas me imprime esa cuenta */
	}
	
	public static void main(String[] args) { /* main */
		Banco coban = new Banco();
		
		CajaAhorro ca1= coban.abrirCajaDeAhorro(12345678); /* solo el dni */
		CuentaCorriente cc1 = coban.abrirCuentaCorriente(3456123, 25000); /* dni, descubierto */
		CajaAhorro ca2 = coban.abrirCajaDeAhorro(33333445);
		
		coban.agregarCuenta(ca2);
		coban.agregarCuenta(cc1);
		coban.agregarCuenta(ca1);
		
		coban.listarCuentas();
		
		ca1.depositar(100000);
		ca1.reservar(20000);
		cc1.depositar(50000);
		cc1.extraer(34567.67);
		cc1.transferir(ca2, 60000);
		System.out.println("----------------------");
		coban.listarCuentas();
		
	}
	
}