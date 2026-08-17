import java.util.ArrayList;

public class TestPerson {
	
	/**
	 * Classe TestPerson pour tester la classe Person, et la classe Celebrity (qui hérite de Person)
	 * @param args
	 */

	public static void main(String[] args){
		
		//Exercice 1.8 et 1.9
		System.out.println("\nExercice 1.8 et 1.9");
		Person manu = new Person("Macron","Emmanuel", 43, "Elysee à Paris", new City("Amiens", "France"));
		Person poutine = new Person("Poutine", "Vladimir", 68);
		Person biden = new Person("Biden", "joe");
		
		System.out.println(manu);
		System.out.println(poutine);
		System.out.println(biden);
		
		
		//Exercice 2
		System.out.println("\nExercice 2");
		City paris = new City("Paris", "France", 2000000);
		City newyork = new City("New York", "Etats-unis");		
		new Celebrity("Macron","Emmanuel", 43, "L'Elysee à Paris", new City("Amiens", "France"));
		new Celebrity("Sarkozy","Nicolas", 66, "Paris", paris);
		new Celebrity("Johnson","Boris", 56, "Downing street à London", newyork);
		new Celebrity("Depardieu","Gerard", 72, "Moscou", new City("Châteauroux", "France"));
		new Celebrity("Kravitz","Lenny", 56, "Hotel particulier à Paris", newyork);
		new Celebrity("Lawrence","Jennifer", 30, "Louisville aux USA", new City("Indian Hills", "USA"));
		
		//On va afficher toutes les célébrités
		Celebrity.displayAllCelebrities();		
		
		System.out.println();
		
		//On va afficher seulement les célébrités nées en France ou habitant Paris
		Celebrity.displayCelebritiesFrance();
	}
	
}
