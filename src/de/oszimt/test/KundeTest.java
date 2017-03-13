package de.oszimt.test;

import org.junit.Before;

import de.oszimt.bank.Kunde;
import junit.framework.TestCase;

/**
 * Der Test dient als Spezifikation und wird nach der
 * Klassen-Implementierung erstellt (aus Gr�nden)
 * Getest wird, ob die Klasse Kunde ihre Funktion
 * erf�llt.
 *
 * @version 1.0 07.04.2016
 * @author Anders, Danzeglocke, R�der und Swinka
 */
public class KundeTest extends TestCase{

   Kunde kunde;

   @Override
   @Before
   public void setUp(){
      kunde = new Kunde("Swinka", 3123);
   }

   public void kundeNichtNullTest(){
      assertNotNull(kunde);
   }

   public void nameNichtLeerTest(){
      assertTrue("Name darf nicht leer sein", !kunde.getName().equals(""));
   }

   public void kundennummerVierstelligTest(){
      boolean vierstellig = kunde.getKundennr() >= 1000  && kunde.getKundennr() <= 9999;
      assertTrue("Kundennummer muss vierstellig sein", vierstellig);
   }

   public void testKunde(){
      kundeNichtNullTest();
      nameNichtLeerTest();
      kundennummerVierstelligTest();
   }
}
