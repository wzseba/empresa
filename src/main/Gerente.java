package main;

public class Gerente extends Permanente {

	private static final double VALOR_HORA = 4000;
	private static final double VALOR_ANTIGUEDAD = 1500;

	public Gerente(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos, int anioAntiguedad) {
		super(cantidadHorasTrabajadas, casado, cantidadHijos, anioAntiguedad);

	}

	public double getSalario() {

		/*
		 * Un gerente cobra de manera similar a un empleado de planta permanente pero
		 * su hora trabajada vale$4.000, por antiguedad se le paga $1.500 por año,
		 * mientras que el salario familiar es de el mismo que el de los empleados de
		 * planta permanente y temporal.
		 */
		return super.getCantidadHorasTrabajadas() * Gerente.VALOR_HORA + getCalcularAntiguedad()  + super.getSalarioFamiliar();
	}
	
	public double getCalcularAntiguedad() {
		return super.getAnioAntiguedad() * Gerente.VALOR_ANTIGUEDAD;
	}
}
