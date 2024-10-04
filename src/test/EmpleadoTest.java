package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {
	
	private Empleado empleado;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		this.empleado = new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	// 3 posibles tipos empleados (nulo tmbn)
	// 3 posibles primas
	// 2 posibles extras (megativas o positivas)
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1000_ExtrasPositivas() {
		float expected = 2060;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 800, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1000_ExtrasNegativas() {
		float expected = 2000;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 800, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1500_ExtrasPositivas() {
		float expected = 2160;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1300, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasInferior1500_ExtrasNegativas() {
		float expected = 2100;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1300, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasSuperior1500_ExtrasPositivas() {
		float expected = 2260;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1800, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Vendedor_VentasSuperior1500_ExtrasNegativas() {
		float expected = 2200;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1800, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1000_ExtrasPositivas() {
		float expected = 2560;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 800, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1000_ExtrasNegativas() {
		float expected = 2500;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 800, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1500_ExtrasPositivas() {
		float expected = 2660;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1300, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasInferior1500_ExtrasNegativas() {
		float expected = 2600;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1300, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasSuperior1500_ExtrasPositivas() {
		float expected = 2760;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1800, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Encargado_VentasSuperior1500_ExtrasNegativas() {
		float expected = 2700;
		float actual = empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1800, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1000_ExtrasPositivas() {
		float expected = -1;
		float actual = empleado.calculoNominaBruta(null, 800, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1000_ExtrasNegativas() {
		float expected = -1;
		float actual = empleado.calculoNominaBruta(null, 800, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1500_ExtrasPositivas() {
		float expected = -1;
		float actual = empleado.calculoNominaBruta(null, 1300, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasInferior1500_ExtrasNegativas() {
		float expected = -1;
		float actual = empleado.calculoNominaBruta(null, 1300, -2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasSuperior1500_ExtrasPositivas() {
		float expected = -1;
		float actual = empleado.calculoNominaBruta(null, 1800, 2);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaEmpleado_Null_VentasSuperior1500_ExtrasNegativas() {
		float expected = -1;
		float actual = empleado.calculoNominaBruta(null, 1800, -2);
		
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNeta_BrutaSuperior2500() {
		float expected = 2296;
		float actual = empleado.calculoNominaNeta(2800);
		
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta_BrutaSuperior2100() {
		float expected = 1870;
		float actual = empleado.calculoNominaNeta(2200);
		
		assertEquals(expected, actual);
	}

	
	@Test
	void testCalculoNominaNeta_BrutaInferior2100() {
		float expected = 1700;
		float actual = empleado.calculoNominaNeta(1700);
		
		assertEquals(expected, actual);
	}


}
