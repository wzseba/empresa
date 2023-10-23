package main;

public class Permanente extends Empleado{
	
	private int anioAntiguedad;
	private static double VALOR_HORA = 3000;
	private static double VALOR_ANTIGUEDAD = 1000;
	
	public Permanente(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos, int anioAntiguedad) {
		super(cantidadHorasTrabajadas, casado, cantidadHijos);
		this.anioAntiguedad = anioAntiguedad;
	}
	
	public double getSalario() {
		return 0;
	}
	

}
