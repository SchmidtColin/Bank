package de.oszimt.bank;

import junit.framework.TestCase;

/**
 * Der Test dient als Spezifikation und wird nach der
 * Klassen-Implementierung erstellt (aus Gründen)
 * Getest wird, ob die Klasse Kunde ihre Funktion 
 * erfüllt.
 * 
 * @version 1.0 07.04.2016
 * @author Anders, Danzeglocke, Röder und Swinka
 */
public class KundeTest extends TestCase{
	public void testKunde(){
		Kunde kunde = new Kunde("Swinka", 3123);
	
		assertNotNull(kunde);
	
		assertTrue("Name darf nicht leer sein", !kunde.getName().equals(""));
		boolean vierstellig = kunde.getKundennr() >= 1000  && kunde.getKundennr() <= 9999;
		assertTrue("Kundennummer muss vierstellig sein", vierstellig);
	}
}
