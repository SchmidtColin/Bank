package de.oszimt.bank;

import java.util.ArrayList;
import java.util.List;

public class Konto {

   private int bankleitzahl;
   private final int kontonummer;
   private double kontostand = 0;
   private final List<Kunde> inhaber = new ArrayList<Kunde>();

   /**
    *
    * @param ersterInhaber First Kunde of the Konto
    * @param knr
    */
   public Konto(final Kunde ersterInhaber,final int knr) {
      inhaber.add(ersterInhaber);
      kontonummer = knr;
   }

   /**
    * Adds amount to the kontostand
    *
    * @param amount to add, must be positive
    */
   public void einzahlen(final double amount) {
      if (amount > 0) {
         kontostand += amount;
      }
   }

   /**
    * Returns the kontostand
    *
    * @return the kontostand
    */
   public double getKontostand() {
      return kontostand;
   }

   /**
    * Removes amount from kontostand
    *
    * @param amount to add, must be positive
    * @return true if successful, false if not
    */
   public boolean abheben(final float amount) {
      if (amount > 0 && kontostand >= amount) {
         kontostand -= amount;
         return true;
      }
      return false;
   }

   /**
    * Gets the original Kontoinhaber
    *
    * @return Kunde
    */
   public Kunde getFirstKontoInhaber() {
      return inhaber.get(0);
   }

   /**
    * Gets the BLZ
    *
    * @return blz
    */
   public int getBankleitzahl() {
      return bankleitzahl;
   }


   /**
    * Gets the Kontonummer
    *
    * @return
    */
   public int getKontonummer() {
      return kontonummer;
   }
}
