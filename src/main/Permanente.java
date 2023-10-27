package main;

public class Permanente extends Empleado {

	private int anioAntiguedad;
	private static final double VALOR_HORA = 3000;
	private static final double VALOR_ANTIGUEDAD = 1000;

	public Permanente(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos, int anioAntiguedad) {
		super(cantidadHorasTrabajadas, casado, cantidadHijos);
		this.anioAntiguedad = anioAntiguedad;
	}

	public double getSalario() {
		/*
		 * Empleado de planta permanente cobra la cantidad de horas trabajadas por
		 * $3.000,mas antiguedad($1.000 por año de antiguedad), mas salario familiar.
		 */
		return this.getCantidadHorasTrabajadas() * Permanente.VALOR_HORA + getCalculoAntiguedad() + this.getSalarioFamiliar();
	}

	public double getCalculoAntiguedad() {
		return anioAntiguedad * Permanente.VALOR_ANTIGUEDAD;
	}
	
	public int getAnioAntiguedad() {
		return anioAntiguedad;
	}

}
