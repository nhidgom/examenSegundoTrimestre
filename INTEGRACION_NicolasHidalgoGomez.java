package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class INTEGRACION_NicolasHidalgoGomez {

	/*
	 * En el test se espera que todos los metodos de la clase Instituto funcionen
	 * correctamete en el que se devuelva al final el booleano true.
	 */
	@Test
	public void testIntegracionDelInstituto() {
		Instituto instituto = new Instituto(4);
		instituto.agregarDepartamento("Biología", 300.75);
		instituto.agregarDepartamento("Historia", 300.75);
		instituto.agregarDepartamento("Mates", 300.75);
		instituto.agregarDepartamento("Física", 300.75);
		assertTrue(instituto.realizarPedido("Biología", 150), "El departamento de Biología puede realizar pedidos");
	}

}
