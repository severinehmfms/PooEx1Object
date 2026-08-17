import java.util.ArrayList;

/**
 * Classe Person : représente une personne
 */ 

public class Person {
	protected String namePerson;
	protected String firstNamePerson;
	protected int agePerson;
	protected String addressPerson;
	protected City birthPlace;
	
	/**
	 * Constructeur avec toutes les informations
	 * @param namePerson
	 * @param surnamePerson
	 * @param agePerson
	 * @param adressePerson
	 * @param birthPlace
	 */
	public Person(String namePerson, String surnamePerson, int agePerson, String adressePerson, City birthPlace) {
		this.namePerson = namePerson;
		this.firstNamePerson = surnamePerson;
		this.agePerson = agePerson;
		this.addressPerson = adressePerson;
		this.birthPlace = birthPlace;
	}
	/**
	 * Constructeur allégé avec uniquement nom, prénom et âge
	 * @param namePerson
	 * @param surnamePerson
	 * @param agePerson
	 */
	public Person(String namePerson, String surnamePerson, int agePerson) {
		this.namePerson = namePerson;
		this.firstNamePerson = surnamePerson;
		this.agePerson = agePerson;
	}
	/**
	 * Constructeur encore plus allégé avec nom et prénom seulement
	 * @param namePerson
	 * @param surnamePerson
	 */
	public Person(String namePerson, String surnamePerson) {
		this.namePerson = namePerson;
		this.firstNamePerson = surnamePerson;
	}
	
	/**
	 * Méthode toString
	 */
	public String toString() {
		String birthPlaceStr = "null";
		if (this.birthPlace != null) {
			birthPlaceStr = "[name=" + this.birthPlace.getNameCity() + ", state=" + (this.birthPlace.getNameCountry() != null ? this.birthPlace.getNameCountry() : "") +"; nbInHabitants = " + this.birthPlace.nbInHabitants + "]";
		}
		return "Person [lastName=" + this.namePerson + ", firstName=" + this.firstNamePerson + ", age=" + this.agePerson + ", address = "+ 		
				(this.addressPerson != null ? this.addressPerson : "unknown")+"] Born "+birthPlaceStr;
	}
	/**
	 * Getters et Setters
	 * @return
	 */
	public String getNamePerson() {
		return namePerson;
	}

	public void setNamePerson(String namePerson) {
		this.namePerson = namePerson;
	}

	public String getFirstNamePerson() {
		return firstNamePerson;
	}

	public void setFirstNamePerson(String firstNamePerson) {
		this.firstNamePerson = firstNamePerson;
	}

	public int getAgePerson() {
		return agePerson;
	}

	public void setAgePerson(int agePerson) {
		this.agePerson = agePerson;
	}

	public String getAddressPerson() {
		return addressPerson;
	}

	public void setAddressPerson(String addressPerson) {
		this.addressPerson = addressPerson;
	}

	public City getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(City birthPlace) {
		this.birthPlace = birthPlace;
	}
	
	
	
}
