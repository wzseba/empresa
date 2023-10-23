package main;

public class Gerente extends Permanente{
	
	
	private static double VALOR_HORA = 4000;
	private static double VALOR_ANTIGUEDAD = 1500;

	public Gerente(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos, int anioAntiguedad) {
		super(cantidadHorasTrabajadas, casado, cantidadHijos, anioAntiguedad);
		
	}
	
	public double getSalario() {
		return 0;
	}
}
