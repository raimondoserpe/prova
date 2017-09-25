/*
Definire una classe VotoEsame che implementi l'interfaccia Measurable.
Un oggetto VotoEsame ha un punteggio e un voto in lettere (come B+). 
*/

package interfacce;

public class VotoEsame implements Measurable{
	private int voto;
	private String votoInLettere;
	
	public VotoEsame(int vote) {
		voto=vote;
	}
	
	//Metodi
	
	public double getMeasure() {
		return voto;
	}
		
	public String getVotoInLettere(){
		if(voto>=28){
			votoInLettere = "A";
		}else if(voto<28 && voto>=25){
			votoInLettere = "B";
		}else if(voto<25 && voto>=22){
			votoInLettere = "C";
		}else if(voto>=18 && voto<22){
			votoInLettere = "D";
		}else{
			votoInLettere = "Bocciato";
		}
		return votoInLettere;
	}
}
