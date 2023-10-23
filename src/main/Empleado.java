package main;

public abstract class Empleado {
	
	private double cantidadHorasTrabajadas;
	private boolean casado;
	private int cantidadHijos;
	private static double EMPLEADO_CASADO = 1000;
	private static double SALARIO_FAMILIAR = 2000;
	
	public Empleado(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
	}
	
	public abstract double getSalario();
	
	protected double getSalarioFamiliar() {
		return 0;
	}

}
