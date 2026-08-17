
public class TestCity {

	
	public static void main(String[] args){
		
		//Exercice 1.1 
		System.out.println("Exercice 1.1");
		City toulouse = new City("Toulouse", "France", 450000);
		City merignac = new City("Mérignac", "France", 78000);
		City bayonne = new City("Bayonne", "France", 56000);
		City stgeours = new City("Saint-Geours-de-Maremne", "France", 2900);
		
		toulouse.beautifulDisplay();
		merignac.beautifulDisplay();
		bayonne.beautifulDisplay();
		stgeours.beautifulDisplay();
		//toulouse.nbInHabitants = toulouse.nbInHabitants + 20000;		
		
		//Exercice 1.2
		System.out.println("\n Exercice 1.2");
		//toulouse.nbInHabitants = -200;
		toulouse.setNbInHabitants(-200);
		toulouse.beautifulDisplay();
		toulouse.reductPopulation(500000);
		toulouse.beautifulDisplay();
		toulouse.reductPopulation(100000);
		toulouse.beautifulDisplay();
		
		//Exercice 1.3
		System.out.println("\n Exercice 1.3");
		City rabat = new City("Rabat", 577000);
		rabat.beautifulDisplay();
		rabat.setNameCountry("Maroc");
		rabat.beautifulDisplay();
		
		//Exercice 1.4 et 1.5 : En fait j'avais déjà écrit la méthode toString! Et effectivement si je crée pas toString le System.out.println(toulouse); va planter
		//J'ai quand même créé la .display... 
		System.out.println("\n Exercice 1.4");
		toulouse.display();
		
		//Exercice 1.6 
		//J'avais déjà mis un toString, j'ai mis mon toString dans une nouvelle méthode beautifulDisplay... pour pas casser mes exos précédents!
		System.out.println("\n Exercice 1.6");
		System.out.println(toulouse);
		
		//Exercice 1.7
		System.out.println("Nombre de villes créées : " + City.nbCitys);
		City paris = new City("Paris", "France", 2000000);
		City nice = new City("Nice", "France", 340000);
		System.out.println("Nombre de villes créées : " + City.nbCitys);
		
		//Exercice 1.8
		
		
		
	}
}
