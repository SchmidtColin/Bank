package de.oszimt.bank;

import java.util.ArrayList;
import java.util.List;


/**
 * Handling for {@link Konto} and {@link Kunde}.
 *
 * @author Sebastian Gass, Guido Eckelt, Jannis Mattheis, Tobias Danzeglocke
 */
public class Bank {
   private static final String BLZ = "100444999";
   private static final String NAME = "Bank of Berlin";
   private static Bank INSTANCE;

   private List<Kunde> kunden;
   private List<Konto> konten;


   public List<Kunde> getKunden() {
      return kunden;
   }


   public void setKunden(List<Kunde> kunden) {
      this.kunden = kunden;
   }

   private Bank() {
      kunden = new ArrayList<>();
      konten = new ArrayList<>();
   }

   /**
    * Returns the instance of Bank.
    *
    * @return an instance of Bank
    */
   public static Bank getInstance() {
      if(INSTANCE == null) {
         INSTANCE = new Bank();
      }
      return INSTANCE;
   }


   public List<Konto> getKonten() {
      return konten;
   }



   public void setKonten(List<Konto> konten) {
      this.konten = konten;
   }


   /**
    * Adds a Kunde to the Bank.
    *
    * @param kunde the Kunde to add
    */
   public void addKunde(final Kunde kunde) {
      if(kunden.contains(kunde)) {
         throw new IllegalArgumentException("Der Kunde existiert bereits.");
      }
      kunden.add(kunde);
   }

   /**
    * Adds a Konto to the Bank
    *
    * @param konto the Konto to add
    */
   public void addKonto(final Konto konto) {
      if(konten.contains(konto)) {
         throw new IllegalArgumentException("Das Konto existiert bereits.");
      }
      konten.add(konto);
   }

   /**
    * @return the Bank name
    */
   public String getName() {
      return NAME;
   }
}
