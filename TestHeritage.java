package techstore;

public class TestHeritage {
	public static void main(String[] args) {
		Adulte a1 = new Adulte("Amine", 35, "Ingénieur");
		Enfant e1 = new Enfant("Sami", 10, "École primaire");
		Bebe b1 = new Bebe("Lina", 1, true);
		System.out.println(a1);
		System.out.println(e1);
		System.out.println(b1);
		
		System.out.println(a1.getNom());
		
		
		System.out.println("----====----");
		a1.afficherIdentite();
		System.out.println("----====----");
		
		TypePersonne type = TypePersonne.ADULTE;
		System.out.println(type);
		
		for(TypePersonne t : TypePersonne.values()) {
			System.out.println(t);
		}
		
		
	}
}
/*16.Done
 * 17.Done
 * 18. Extends permet de faire l'heritage.
 *  Super() permet de manipuler une attribut prive qui herite d'un class mere.
 * @Override permet de afficher la place du toString pour l'affichage?
 * 
 * 19.Done
 * 20.Done ligne 12.
 *  
 *  
 *  
 *  Explication Enum: Enum est pour specifie le class d'un object
 *  Son champ is peuvent d'etre?
 *  
 *  Interface C est pour sasir une interface or TEXT special pour un object like ToString() is une interface par default
 *  mais poour cree des nouveau interfaces pour plusieur option
 *  
 *  
 *  
 *  
 *  */
 