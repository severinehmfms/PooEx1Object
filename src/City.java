/**
 * Classe City : représente une ville
 */

public class City {
	protected String nameCity;
	protected String nameCountry;
	protected int nbInHabitants;
	
	public static int nbCitys;
	
	/**
	 * Constructeur avec toutes les informations sur la commune
	 * @param nameCity
	 * @param nameCountry
	 * @param nbInHabitants
	 */
	public City(String nameCity, String nameCountry, int nbInHabitants) {
		this.nameCity = nameCity;
		this.nameCountry = nameCountry;
		this.nbInHabitants = nbInHabitants;
		this.nbCitys++;
	}
	/**
	 * Constructeur allégé nom et pays uniquement
	 * @param nameCity
	 * @param nameCountry
	 */
	public City(String nameCity, String nameCountry) {
		this.nameCity = nameCity;
		this.nameCountry = nameCountry;
		this.nbCitys++;
	}
	/**
	 * Constructeur allégé nom et nombre d'habitants uniquement
	 * @param nameCity
	 * @param nbInHabitants
	 */
	public City(String nameCity, int nbInHabitants) {
		this.nameCity = nameCity;
		this.nbInHabitants = nbInHabitants;
		this.nbCitys++;
	}
	
	/**
	 * Affichage pour exercices 1.4 et 1.5
	 */
	public void display() {
		String strNameCountry = this.nameCountry != "" ? nameCountry : "unknown";
		System.out.println("Ville de " + this.nameCity + " en " + strNameCountry + " ayant " + this.nbInHabitants + " habitants");
	}
	
	/**
	 * Joli affichage pour l'exercice 1.1 à 1.4
	 */
	public void beautifulDisplay() {
		System.out.println("[Ville : " + this.nameCity + "] [Pays : " + (this.nameCountry != null ? this.nameCountry : "unknown") + "] [Nombre d'habitants : " + this.nbInHabitants + "]");
	}
	
	/**
	 * Fonction toString
	 */
	public String toString() {
		String strNameCountry = this.nameCountry != "" ? nameCountry : "unknown";
		return "Ville de " + this.nameCity + " en " + strNameCountry + " ayant " + this.nbInHabitants + " habitants";
	}

	/**
	 * Getters et Setters
	 * @return
	 */
	public String getNameCity() {
		return nameCity;
	}

	public void setNameCity(String nameCity) {
		this.nameCity = nameCity;
	}

	public String getNameCountry() {
		 return nameCountry;
	}

	public void setNameCountry(String nameCountry) {
		this.nameCountry = nameCountry;
	}

	public int getNbInHabitants() {
		return nbInHabitants;
	}

	public void setNbInHabitants(int nbInHabitants) {
		if (nbInHabitants > 0) {
			this.nbInHabitants = nbInHabitants;
		}else {
			System.out.println("ERREUR - Le nombre d'habitants ne peut pas être inférieur à 0 !");
		}
	}
	
	public int getNbCitys() {
		return nbCitys;
	}

	public void setNbCitys(int nbCitys) {
		this.nbCitys = nbCitys;
	}

	/**
	 * Fonction qui permet de réduire la population de la ville, du nombre passé en paramètre
	 * @param nbReduct
	 */
	public void reductPopulation(int nbReduct) {
		if (nbReduct < this.nbInHabitants) {
			this.nbInHabitants = this.nbInHabitants - nbReduct;
		}else {
			System.out.println("ERREUR - Le nombre d'habitants à enlever ne peut pas être inférieur au nombre d'habitants !");
		}
	}
	
	/**
	 * Fonction qui permet d'ajouter un nombre à la population de la ville
	 * @param nbReduct
	 */
	public void addPopulation(int nbReduct) {
		this.nbInHabitants = this.nbInHabitants + nbReduct;
	}
	
}
