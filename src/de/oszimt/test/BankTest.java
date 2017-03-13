package de.oszimt.test;

import org.junit.Before;

import de.oszimt.bank.Bank;
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

   public void testBank() {
      banknameRichtigTest();
   }
}
