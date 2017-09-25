package interfacce;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class ProdottiTest {

	public static void main(String[] args) {
		
		ArrayList<Prodotti> lista = new ArrayList<>();
		GregorianCalendar dataAttuale = new GregorianCalendar();
		
		Prodotti prodotto1 = new Prodotti(3, "prodotto1", 5, dataAttuale);
		Prodotti prodotto2 = new Prodotti(5, "prodotto2", 15, dataAttuale);
		Prodotti prodotto3 = new Prodotti(1, "prodotto3", 45, dataAttuale);
		Prodotti prodotto4 = new Prodotti(4, "prodotto4", 35, dataAttuale);
		Prodotti prodotto5 = new Prodotti(2, "prodotto5", 2, dataAttuale);
		
		lista.add(prodotto1);
		lista.add(prodotto2);
		lista.add(prodotto3);
		lista.add(prodotto4);
		lista.add(prodotto5);
		
		lista.sort(new ComparatorCodice());
		
		for(Prodotti p: lista)
		System.out.println(p.getDescrizione() +" "+ p.getCodice());
	}

}
