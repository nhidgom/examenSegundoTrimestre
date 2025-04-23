package examenSegundoTrimestre;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CAJA_NEGRA_NicolasHidalgoGomez {

	// Se verifica el límite del monto el cual depende del presupuesto
	@Test
	public void testLimiteMontoExcesivo() {
		Departamento departamento = new Departamento("Pepe", 1550.13);
		assertFalse(departamento.procesarPedido(2000), "El monto es excesivo");
	}

	// Se comprueba el límite cuando el monto no traspasa el presupuesto
	@Test
	public void testLimiteMontoNormal() {
		Departamento departamento = new Departamento("Pepe", 1550.13);
		assertTrue(departamento.procesarPedido(500), "Se resto el monto del presupuesto");
	}

	// En el test se espera que el monto sobrepase el presupuesto
	@Test
	public void testEquivalenciaMontoMayor() {
		Departamento departamento = new Departamento("Pepe", 1550.13);
		assertFalse(departamento.procesarPedido(2000), "El monto es mayor al presupuesto");
	}

	// Este test comprueba que el monto este por debajo del presupuesto
	@Test
	public void testEquivalenciaMontoMenor() {
		Departamento departamento = new Departamento("Pepe", 1550.13);
		assertTrue(departamento.procesarPedido(500), "El monto es menor al presupuesto");
	}

}
