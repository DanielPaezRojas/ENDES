package calculos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest2 {

	@Test
	void testRestar1() {
		assertEquals(5, Calculadora.restar(10, 5));
	}
	
	@Test
	void testRestar2() {
		assertEquals(0, Calculadora.restar(6, 6)); 
	}

	@Test
	void testRestar3() {
		assertEquals(3, Calculadora.restar(5, 2)); 
	}
	
	@Test
	void testDividir1() {
		assertEquals(1, Calculadora.dividir(4, 4));
	}

	@Test
	void testDividir2() {
		assertEquals(1, Calculadora.dividir(3, 2));
	}
	
	@Test
	void testDividir3() {
		assertThrows(java.lang.ArithmeticException.class,()->Calculadora.dividir(4, 0));
	}
	
	@Test
	void testDividir4() {
		assertAll("Juntado Test", 
				 ()->assertEquals(1, Calculadora.dividir(4, 4)), 
				 ()->assertEquals(1, Calculadora.dividir(3, 2)) 
				); 
	}
	
	@Test
	void testDividir5() {
		assertTrue(Calculadora.dividir(6, 2)==3);	
		}
	
	@Test
	void testPar() {
		assertTrue(Calculadora.esPar(2));
		assertFalse(Calculadora.esPar(3));
	}
}