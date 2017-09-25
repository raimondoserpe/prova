/*
Programma che calcoli il: valore medio, minimo e massimo di un insieme di oggetti VotoEsame.
 */

package interfacce;

import java.util.ArrayList;

public class CalcolaVoti {
	ArrayList<VotoEsame> listaVoti = new ArrayList<>();
	Measurable min, max;

	public CalcolaVoti() {
		min=null;
		max=null;
	}

	//Metodi

	public void addVoto(Measurable v){
		listaVoti.add((VotoEsame) v);
		for(Measurable vot: listaVoti){
			if(min == null){
				min = vot;
				continue;
			} else if(max==null){
				if(vot.getMeasure() < min.getMeasure()){
					max = min;
					min = vot;
					continue;
				}else{
					max = vot;
					continue;
				}
			} else if(min.getMeasure() > vot.getMeasure()){
				min = vot;
				continue;
			} else if(max.getMeasure() < vot.getMeasure()){
				max = vot;
				continue;
			}
		}
	}

	public double getVotoMedio(){
		double tot = 0;
		for(VotoEsame v: listaVoti){
			tot+=v.getMeasure();
		}
		return tot/listaVoti.size();
	}

	public Measurable getMin(){
		return min;
	}

	public Measurable getMax(){
		return max;
	}

}
