package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CAJA_BLANCA_NicolasHidalgoGomez {


	/* Se verifica que cuando no encuentre el nombre del departeamento devuelva un
	false*/
	@Test
	public void testCorbeturaDeDecisionesPedidosRealizados() {
		Instituto instituto = new Instituto(1);
		instituto.agregarDepartamento("Biología", 300.75);
		assertFalse(instituto.realizarPedido("Historia", 150), "Departamento no encontrado");
	}

	/* Se verifica que cuando  encuentre el nombre del departeamento devuelva un
	true*/
	@Test
	public void testCorbeturaDeDecisionesPedidosNoRealizados() {
		Instituto instituto = new Instituto(1);
		instituto.agregarDepartamento("Biología", 300.75);
		assertTrue(instituto.realizarPedido("Biología", 150), "El departamento puede realizar pedidos");
	}

}
