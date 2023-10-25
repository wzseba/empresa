package main;

public class Temporal extends Empleado {

	private static double VALOR_HORA = 2000;

	public Temporal(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos) {
		super(cantidadHorasTrabajadas, casado, cantidadHijos);
	}

	public double getSalario() {

		/*
		 * Empleado de planta temporaria, no cobra antiguedad, solo cobra cantidad de
		 * horas trabajadas por $2.000, mas salario familiar.
		 */
		return this.getCantidadHorasTrabajadas() * Temporal.VALOR_HORA + this.getSalarioFamiliar();
	}
}
