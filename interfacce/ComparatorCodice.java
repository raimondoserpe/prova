package interfacce;

import java.util.Comparator;

public class ComparatorCodice implements Comparator<Prodotti> {

	public int compare(Prodotti o1, Prodotti o2) {
		return o1.getCodice()-o2.getCodice();
	}
	
}
