/*
- Creare una classe Country che realizzi l’interfaccia Comparable.
- Una nazione ha un nome e una superficie.
- Il metodo compareTo deve confrontare due nazioni in base alla superficie del loro territorio. 
*/

package interfacce;

@SuppressWarnings("rawtypes")
public class Country implements Comparable{
	private String nome;
	private int area;	
	
	public Country(String name, int area) {
		nome=name;
		this.area=area;
	}
	
	//Metodi
	
	public int getArea() {
		return area;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int compareTo(Object o) {
		Country country = (Country) o;
		return area-country.area;
	}

}
