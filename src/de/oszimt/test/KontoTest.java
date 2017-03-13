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
public class KontoTest extends TestCase{
	public void testKonto() {
		Bank bank = Bank.getInstance();
		Kunde kunde1 = new Kunde("Meier", 4711);
		Konto konto1 = new Konto(kunde1, 65502757);
		bank.addKunde(kunde1);
		bank.addKonto(konto1);
		
		// 1. Test: Ist Konto am Anfang Null?
		assertTrue(0.00 == konto1.getKontoStand());
		
		// 2. Test: Funktioniert das Einzahlen?
		konto1.einzahlen(100);
		konto1.einzahlen(-50);
		assertTrue(100.00 == konto1.getKontoStand());
		
		// 3. Test: Funktioniert das Abheben (ohne Dispo)?
		konto1.abheben(70);
		assertTrue(30.00 == konto1.getKontoStand());
		assertTrue(false == konto1.abheben(31));
		
		// 4. Test: Funktioniert der Zugriff auf den Kontoinhaber?
		assertTrue(konto1.getFirstKontoInhaber().getName().equals("Meier"));
	}
}

