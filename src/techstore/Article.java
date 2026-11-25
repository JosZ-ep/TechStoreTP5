package techstore;

abstract class Article {
	private int id;
	private String nom;
	public String Refrence;
	private double prix;
	
	
	public Article(int id, String nom, String Refrence,double prix) {
		this.id = id;
		this.nom = nom;
		this.Refrence= Refrence;
		this.prix = prix;
		
	}
	public Article(int id, String nom, double prix ) {
		this.id = id;
		this.nom = nom;
		this.prix= prix;
		
	}
	
	public void setId(int id) {
		this.id=id;
		
	}
	public int getId() {
		return this.id;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}
