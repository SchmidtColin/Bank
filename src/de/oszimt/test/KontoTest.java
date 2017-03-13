package de.oszimt.test;

import org.junit.Before;

import de.oszimt.bank.Bank;
import de.oszimt.bank.Konto;
import de.oszimt.bank.Kunde;
import junit.framework.TestCase;

/**
 * Der Test dient als Spezifikation und wird nach der
 * Klassen-Implementierung erstellt (aus Gr�nden)
 *
 * @version 1.0 07.04.2016
 * @author Tobias Danzeglocke
 *         abgeschrieben von Dr. Ehlert
 */
public class KontoTest extends TestCase {

   Bank bank;
   Kunde kunde1;
   Konto konto1;

   @Override
   @Before
   public void setUp() {
      bank = Bank.getInstance();
      kunde1 = new Kunde("Meier", 4711);
      konto1 = new Konto(kunde1, 65502757);
      bank.addKunde(kunde1);
      bank.addKonto(konto1);
   }

   public void istKontoAmAnfangNullTest() {
      assertTrue(0.00 == konto1.getKontostand());
   }

   public void einzahlenTest() {
      konto1.einzahlen(100);
      konto1.einzahlen(-50);
      assertTrue(100.00 == konto1.getKontostand());
   }

   public void abhebenOhneDispoTest() {
      konto1.einzahlen(100);
      konto1.abheben(70);
      assertTrue(30.00 == konto1.getKontostand());
      assertTrue(false == konto1.abheben(31));
   }

   public void zugriffAufKontoinhaberTest() {
      assertTrue(konto1.getFirstKontoInhaber().getName().equals("Meier"));
   }

   public void testKonto() {
      istKontoAmAnfangNullTest();
      abhebenOhneDispoTest();
      zugriffAufKontoinhaberTest();
   }
}
