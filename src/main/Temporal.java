package main;

public class Temporal extends Empleado{

	private static double VALOR_HORA = 2000;
	
	public Temporal(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos) {
		super(cantidadHorasTrabajadas, casado, cantidadHijos);
	}
	
	public double getSalario() {
		return 0;
	}
}
