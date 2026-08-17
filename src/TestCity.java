
public class TestCity {

	
	public static void main(String[] args){
		
		//Exercice 1.1
		City toulouse = new City("Toulouse", "France", 450000);
		City merignac = new City("Mérignac", "France", 78000);
		City bayonne = new City("Bayonne", "France", 56000);
		City stgeours = new City("Saint-Geours-de-Maremne", "France", 2900);
		System.out.println("Ville : " + toulouse.nameCity + " (" + toulouse.nameCountry + ") - Nombre d'habitants : " + toulouse.nbInHabitants);
		System.out.println("Ville : " + merignac.nameCity + " (" + merignac.nameCountry + ") - Nombre d'habitants : " + merignac.nbInHabitants);
		System.out.println("Ville : " + bayonne.nameCity + " (" + bayonne.nameCountry + ") - Nombre d'habitants : " + bayonne.nbInHabitants);
		System.out.println("Ville : " + stgeours.nameCity + " (" + stgeours.nameCountry + ") - Nombre d'habitants : " + stgeours.nbInHabitants);
		toulouse.nbInHabitants = toulouse.nbInHabitants + 20000;
		System.out.println("Après mise à jour, Ville : " + toulouse.nameCity + " (" + toulouse.nameCountry + ") - Nombre d'habitants : " + toulouse.nbInHabitants);
		
		//Exercice 1.2
		
		
	}
}
