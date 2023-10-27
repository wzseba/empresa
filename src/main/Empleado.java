package main;

public abstract class Empleado {
	
	private double cantidadHorasTrabajadas;

	private boolean casado;
	private int cantidadHijos;
	private static final double VALOR_CASADO = 1000;
	private static final double VALOR_HIJO = 2000;
	
	public Empleado(double cantidadHorasTrabajadas, boolean casado, int cantidadHijos) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.casado = casado;
		this.cantidadHijos = cantidadHijos;
	}
	
	public double getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}
	
	public int getCantidadHijos() {
		return cantidadHijos;
	}
	
	public abstract double getSalario();
	
	protected double getSalarioFamiliar() {
		double sf = cantidadHijos * Empleado.VALOR_HIJO;
		if(casado) {
			sf += Empleado.VALOR_CASADO;
		}
		return sf;
	}

}
