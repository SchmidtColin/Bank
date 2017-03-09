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
	 * @param ersterInhaber
	 * @param knr
	 */
	public Konto(final Kunde ersterInhaber,final int knr) {
		inhaber.add(ersterInhaber);
		kontonummer = knr;
	}

	/**
	 * Adds amount to the kontostand
	 * 
	 * @param zahl
	 */
	public void einzahlen(final double amount) {
		if (amount > 0) {
			kontostand += amount;
		}
	}

	/**
	 * Returns the kontostand
	 * 
	 * @return double
	 */
	public double getKontoStand() {
		return kontostand;
	}

	/**
	 * Removes amount from kontostand
	 * 
	 * @param zahl
	 *            positive integer
	 * @return boolean
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
	 * @return
	 */
	public int getBankleitzahl() {
		return bankleitzahl;
	}

	/**
	 * Sets the BLZ
	 * 
	 * @param bankleitzahl
	 */
	public void setBankleitzahl(final int bankleitzahl) {
		this.bankleitzahl = bankleitzahl;
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
