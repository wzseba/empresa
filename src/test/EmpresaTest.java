package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Empleado;
import main.Empresa;
import main.Gerente;
import main.Permanente;
import main.Temporal;

class EmpresaTest {

	@Test
	void empleadoTemporalTest() {
		Temporal pedro = new Temporal(80, true, 0);
		assertEquals(161000, pedro.getSalario());
	}
	
	@Test
	void empleadoPermanenteTest() {
		Permanente juan = new Permanente(80, true, 2, 6);
		assertEquals(251000, juan.getSalario());
	}
	
	@Test
	void gerenteTest() {
		Empleado luis = new Gerente(160, true, 1, 10);
		assertEquals(658000, luis.getSalario());
	}
	
	@Test
	void liquidacionSueldosTest() {
		Empresa tecno = new Empresa(4);
		
		Empleado luis = new Gerente(160, true, 1, 10);
		Permanente juan = new Permanente(80, true, 2, 6);
		Temporal pedro = new Temporal(80, true, 0);
		Permanente matias = new Permanente(160, false, 0, 4);
		
		tecno.agregarEmpleado(pedro);
		tecno.agregarEmpleado(matias);
		tecno.agregarEmpleado(juan);
		tecno.agregarEmpleado(luis);
		
		assertEquals(1554000, tecno.montoTotal());
	}

}
