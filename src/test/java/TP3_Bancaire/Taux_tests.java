package TP3_Bancaire;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Taux_tests {
	
	@Test
	void testInteretsLivretA() {	
		assertEquals(688.5f,new LivretA(3f, 22950f).rateCalcul());		
	}
	
	@Test
	void testInteretsPEL() {			
		assertEquals(1224f,new PEL(2f, 61200f).rateCalcul());		
	}
	
	@Test
	void testInteretsPEA() {		
		assertEquals(7350f,new PEA(7f, 150000f,30).rateCalcul());
	}

}

