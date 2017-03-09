package de.oszimt.bank;

public class Kunde {

	private String name;
	private int kundennr;
	
	/**
	 * Constructor
	 * @param name last name of Kunde
	 * @param kundennr id of Kunde
	 */
	public Kunde(final String name, final int kundennr){
		this.name = name;
		this.kundennr = kundennr;
	}
	
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public int getKundennr() {
		return kundennr;
	}

	public void setKundennr(final int kundennr) {
		this.kundennr = kundennr;
	}
}
