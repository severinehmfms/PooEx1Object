

public class City {
	private String nameCity;
	private String nameCountry;
	//public Country country;
	private int nbInHabitants;
	public static int nbCitys;
	
	public City(String nameCity, String nameCountry, int nbInHabitants) {
		this.nameCity = nameCity;
		this.nameCountry = nameCountry;
		this.nbInHabitants = nbInHabitants;
		this.nbCitys++;
	}
	
	public City(String nameCity, String nameCountry) {
		this.nameCity = nameCity;
		this.nameCountry = nameCountry;
		this.nbCitys++;
	}
	
	public City(String nameCity, int nbInHabitants) {
		this.nameCity = nameCity;
		this.nbInHabitants = nbInHabitants;
		this.nbCitys++;
	}
	
	public void display() {
		String strNameCountry = this.nameCountry != "" ? nameCountry : "unknown";
		System.out.println("Ville de " + this.nameCity + " en " + strNameCountry + " ayant " + this.nbInHabitants + " habitants");
	}
	
	public void beautifulDisplay() {
		System.out.println("[Ville : " + this.nameCity + "] [Pays : " + (this.nameCountry != null ? this.nameCountry : "unknown") + "] [Nombre d'habitants : " + this.nbInHabitants + "]");
	}
	
	public String displayBirthPlace() {
		return "[name=" + this.nameCity + ", state=" + (this.nameCountry != null ? this.nameCountry : "unknown") + ", nbInhabitants=" + this.nbInHabitants + "]";
	}

	
	public String toString() {
		String strNameCountry = this.nameCountry != "" ? nameCountry : "unknown";
		return "Ville de " + this.nameCity + " en " + strNameCountry + " ayant " + this.nbInHabitants + " habitants";
	}

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

	public void reductPopulation(int nbReduct) {
		if (nbReduct < this.nbInHabitants) {
			this.nbInHabitants = this.nbInHabitants - nbReduct;
		}else {
			System.out.println("ERREUR - Le nombre d'habitants à enlever ne peut pas être inférieur au nombre d'habitants !");
		}
	}
	
	public void addPopulation(int nbReduct) {
		this.nbInHabitants = this.nbInHabitants + nbReduct;
	}
	
}
