package interfacce;

import java.util.GregorianCalendar;

public class Prodotti {
	private String descrizione;
	private int codice, quantit�;
	private GregorianCalendar dataAcquisto;
	
	public Prodotti(int code, String desc, int q, GregorianCalendar date) {
		codice=code;
		descrizione=desc;
		quantit�=q;
		dataAcquisto=date;
	}
	
	//Metodi
	
	
	
	public int getQuantit�() {
		return quantit�;
	}
	
	@Override
	public String toString() {
		return "Prodotti [descrizione=" + descrizione + ", codice=" + codice + ", quantit�=" + quantit�
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
