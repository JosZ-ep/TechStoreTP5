package techstore;

public class Personne {
	private String nom;
	private int age;
	private String Telephone;
	
	public Personne(String nom, int age, String Telephone) {
	
	this.nom = nom;
	this.age = age;
	this.Telephone = Telephone;
	}
	
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}
	
	public String getNom() {
	return nom;
	}
	public int getAge() {
	return age;
	}
	
	public String getTelephone() {
		return this.Telephone;
	}
	@Override
	public String toString() {
	return "Nom : " + nom + ", âge : " + age;
	}
}

/* Answers for partie 1
 *1. un objet est une instance du class
 *2.une attribut est un element du object par exemple un class personne l attribut est nom
 *3.le constructure est une methode qui permet de saisir l'object
 *4.new permet de CREE une nouvel instance du class dernier
 *5.mot-cle private pour permet de dir que cette attribut n'est pas partageable entre le class or paackage pour securite
 *6.getter est une methode pour retourner un attribut generallement est une methode accessible pour les attribut prive
 *7.setter est une methode pour saisir un attiribut generallement est une methode faire pour les attribut prive.
 *8.parmetre de constructure qui permet du faire definire ce class
 *attribut d'instance  peuvent t etre plusieur 
 *IDK
 *
 *9.this.nom permet de bien precis que le nom de CE OBJECT
 *10.toString() permet de identifier le text au niveau du CLI / terminal pour chaque object il est special d'un object a un autre personallise
 *
 * 
 * 
 **/
