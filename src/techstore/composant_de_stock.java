package techstore;


abstract class ComposantStockage extends Article implements Garantissable {
	public int capacite;
	public ComposantStockage(int id, String nom, String Refrence,float prix,int cap) {
     super(id,nom,Refrence,prix);
     this.capacite=cap;
 }
	public int getCapacite() {
		return capacite;
	}
	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}
	
	@Override
	public int garantirAppareil() {
		if (capacite <= 500) {
			return 1;
		}
		else {
			return 2;
		}
	};
	
	
	
	
	@Override
	public String toString() {
		return "ComposantStockage [capacite=" + capacite + "]";
	}
	
}