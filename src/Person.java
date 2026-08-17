
public class Person {
	private String namePerson;
	private String firstNamePerson;
	private int agePerson;
	private String addressPerson;
	private City birthPlace;
	
	public Person(String namePerson, String surnamePerson, int agePerson, String adressePerson, City birthPlace) {
		this.namePerson = namePerson;
		this.firstNamePerson = surnamePerson;
		this.agePerson = agePerson;
		this.addressPerson = adressePerson;
		this.birthPlace = birthPlace;
	}
	
	public Person(String namePerson, String surnamePerson, int agePerson) {
		this.namePerson = namePerson;
		this.firstNamePerson = surnamePerson;
		this.agePerson = agePerson;
	}
	
	public Person(String namePerson, String surnamePerson) {
		this.namePerson = namePerson;
		this.firstNamePerson = surnamePerson;
	}
	
	public String toString() {
		return "Person [lastName=" + this.namePerson + ", firstName=" + this.firstNamePerson + ", age=" + this.agePerson + ", address = "+ 
				(this.addressPerson != null ? this.addressPerson : "unknown")+"] Born "+(this.birthPlace != null ? this.birthPlace.displayBirthPlace() : "null");
	}
	
}
