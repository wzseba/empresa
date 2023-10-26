package main;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	
	private int cantidadEmpleados;
	private int cuit;
	private String razonSocial;
	private List<Empleado> empleados;
	
	public Empresa(int cantidadEmleados) {
		this.empleados = new ArrayList<Empleado>();
		this.cantidadEmpleados = cantidadEmleados;
	}
	
	public Empresa(int cuit, String razonSocial) {
		this.cuit = cuit;
		this.razonSocial = razonSocial;
	}
	
	public void agregarEmpleado(Empleado e) {
		if(empleados.size() < cantidadEmpleados) {
			empleados.add(e);
		}
		throw new Error("Limite alcanzado");
	}
	
	
	public double montoTotal(double monto) {
		double total = 0;
		for (Empleado empleado : empleados) {
			total += empleado.getSalario();
		}
		return total;
	}
	
	public static void main(String[] args) {
		
		Empresa ecotermo = new Empresa(3);
		
		/*Un empleado temporal con 80hrs trabajadas, casado, sin hijos.*/
		Empleado sebaTemporal = new Temporal(80, true, 0);
		
		/*Un empleado permanente(que no sea gerente) con 80 horas trabajadas, casado, con 2 hijos y 6 años de antiguedad.*/
		Empleado calebPermanente = new Permanente(80, true, 2, 6);
		
		/*Un empleado permanente(que no sea gerente) con 160hrs trabajadas, soltero, sin hijos y con 4 años de antiguedad*/
		Empleado martinPermanente = new Permanente(160, false, 0, 4);
		
		/*Un gerente con 160hrs trabajadas, casado, 1 hijo y 10 años de antiguedad*/
		Empleado juanGerente = new Gerente(160, true, 1, 10);
		
	}

}
