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
public class BankTest extends TestCase {

   Bank bank;

   @Override
   @Before
   public void setUp() {
      bank = Bank.getInstance();
   }

   public void banknameRichtigTest() {
      assertTrue(bank.getName().equals("Bank of Berlin"));
   }

   public void addKundeTest() {
      Kunde kunde = new Kunde("Hans", 1758);
      bank.addKunde(kunde);
      assertTrue(bank.getKunden().size() == 1);
   }

   public void kundeVorhandenTest() {
      Kunde kunde = new Kunde("Hans", 1758);
      bank.addKunde(kunde);
      try {
         bank.addKunde(kunde);
      } catch (IllegalArgumentException e) {
         assertEquals("Der Kunde existiert bereits.", e.getMessage());
      }
   }

   public void addKontoTest() {
      Kunde kunde = new Kunde("Hans", 1758);
      Konto konto = new Konto(kunde, kunde.getKundennr());
      bank.addKonto(konto);
      assertTrue(bank.getKonten().size() == 1);
   }

   public void kontoVorhandenTest() {
      Kunde kunde = new Kunde("Hans", 1758);
      Konto konto = new Konto(kunde, kunde.getKundennr());
      bank.addKonto(konto);
      try {
         bank.addKonto(konto);
      } catch (IllegalArgumentException e) {
         assertEquals("Das Konto existiert bereits.", e.getMessage());
      }
   }

   public void testBank() {
      banknameRichtigTest();
      addKundeTest();
      kundeVorhandenTest();
      addKontoTest();
      kontoVorhandenTest();
   }
}
