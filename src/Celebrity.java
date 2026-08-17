import java.util.ArrayList;

/**
 * Classe celebrity, représente une célébrité, hérite de Person
 */

public class Celebrity extends Person{
	public static ArrayList<Celebrity> listCelebrities = new ArrayList<>();
	
	public Celebrity(String namePerson, String surnamePerson, int agePerson, String adressePerson, City birthPlace) {
		super(namePerson, surnamePerson, agePerson, adressePerson, birthPlace);
		
		//On ajoute la célébrité à la liste des célébrités
		listCelebrities.add(this);
	}

	/**
	 * On redéfinit la méthode d'affichage pour qu'il corresponde à l'exercice sur les personnalités
	 */
	@Override
	public String toString() {
		String birthPlaceStr = "null";
		if (this.birthPlace != null) {
			birthPlaceStr = this.birthPlace.getNameCity() + ", " + this.birthPlace.getNameCountry() + (this.birthPlace.nbInHabitants != 0 ? ", population " + this.birthPlace.getNameCity() + " " + this.birthPlace.nbInHabitants + " habitants " : "");
		}
		return super.namePerson + ", " + super.firstNamePerson + ", " + super.agePerson + "ans, habitant "+ (super.addressPerson != null ? super.addressPerson : "unknown")+", Ville de naissance : "+birthPlaceStr;
	}
	
	/**
	 * Fonction qui affiche toutes les personnalités
	 */
	public static void displayAllCelebrities() {
		System.out.println("Liste des personnalités");
		for (Celebrity celebrity : listCelebrities) {
			System.out.println(celebrity);
		}
	}
	
	/**
	 * Fonction qui affiche les personnalités nées en France ou habitant Paris
	 */
	public static void displayCelebritiesFrance() {
		System.out.println("Liste après notre filtre");
		for (Celebrity celebrity : listCelebrities) {
			if (celebrity.getAddressPerson().toLowerCase().contains("paris") || (celebrity.getBirthPlace().getNameCountry().toLowerCase().equals("france")) ) {
				System.out.println(celebrity);
			}
		}
	}
	
}
