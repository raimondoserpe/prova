//vieni bocciato


/*
Visualizzarne il punteggio massimo (anche in lettere) e medio.
*/

package interfacce;

public class VotiTest {

	public static void main(String[] args) {
		CalcolaVoti calcolaVoti = new CalcolaVoti();
		VotoEsame v = new VotoEsame(30);
		VotoEsame v1 = new VotoEsame(10);
		VotoEsame v2 = new VotoEsame(20);
		VotoEsame v3 = new VotoEsame(25);
		calcolaVoti.addVoto(v);
		calcolaVoti.addVoto(v1);
		calcolaVoti.addVoto(v2);
		calcolaVoti.addVoto(v3);
		System.out.println(calcolaVoti.getMin().getMeasure());		
		System.out.println(calcolaVoti.getMax().getMeasure());
		System.out.println(calcolaVoti.getVotoMedio());
		System.out.println(((VotoEsame) calcolaVoti.getMax()).getVotoInLettere());
	}

}
