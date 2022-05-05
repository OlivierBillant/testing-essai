package fr.eni.testing;


import org.junit.Assert;
import org.junit.Test;

import fr.eni.controller.Calculatrice;



public class CalculatriceTest {

	@Test
	public void addition() {
		int expected = 30;
		int valeur = 0;
		try {
			valeur = Calculatrice.addition(10,20);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Assert.assertEquals(expected, valeur, 0.00001);
	}
	
	@Test
	public void soustraction() {
		int expected = 10;
		int valeur = Calculatrice.soustraction(20,10);
		
		Assert.assertEquals(expected, valeur, 0.00001);
	}

	@Test (expected = ArithmeticException.class)
	public void divisionByZero() {
		double expected = 4;
		double valeur = Calculatrice.division(12,0);
		Assert.assertEquals(expected, valeur, 0.00001);
	}

	@Test
	public void divisionQuiMarche() {
		double expected = 4;
		double valeur = Calculatrice.division(12,3);
		Assert.assertEquals(expected, valeur, 0.00001);
	}

	
}
