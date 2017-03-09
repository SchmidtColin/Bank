package de.oszimt.bank;

import junit.framework.TestCase;

/**
 * Der Test dient als Spezifikation und wird nach der
 * Klassen-Implementierung erstellt (aus Gründen)
 * 
 * @version 1.0 07.04.2016
 * @author Tobias Danzeglocke
 * abgeschrieben von Dr. Ehlert
 */
public class BankTest extends TestCase{
	public void testBank() {
		Bank bank = Bank.getInstance();
		
		// 1. Test: Ist der Bankname richtig?
		assertTrue(bank.getName().equals("Bank of Berlin"));
	}
}
