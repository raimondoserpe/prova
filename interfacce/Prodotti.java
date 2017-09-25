package interfacce;

import java.util.GregorianCalendar;

public class Prodotti {
	private String descrizione;
	private int codice, quantità;
	private GregorianCalendar dataAcquisto;
	
	public Prodotti(int code, String desc, int q, GregorianCalendar date) {
		codice=code;
		descrizione=desc;
		quantità=q;
		dataAcquisto=date;
	}
	
	//Metodi
	
	
	
	public int getQuantità() {
		return quantità;
	}
	
	@Override
	public String toString() {
		return "Prodotti [descrizione=" + descrizione + ", codice=" + codice + ", quantità=" + quantità
				+ ", dataAcquisto=" + dataAcquisto + "]";
	}

	public String getDescrizione() {
		return descrizione;
	}
	
	public int getCodice() {
		return codice;
	}
	
	public GregorianCalendar getDataAcquisto() {
		return dataAcquisto;
	}
}
