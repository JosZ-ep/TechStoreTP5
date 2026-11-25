package techstore;

abstract class peripherique extends Article {
	String technologieDeConnexion;
	String interfaceAvecOrdinateur;
	
	public peripherique(int id, String nom, String Refrence,double prix,String TC,String IO){
		super(id,nom,Refrence,prix);
		this.technologieDeConnexion=TC;
		this.interfaceAvecOrdinateur=IO;
		
		
	}

	public String getTechnologieDeConnexion() {
		return technologieDeConnexion;
	}

	public void setTechnologieDeConnexion(String technologieDeConnexion) {
		this.technologieDeConnexion = technologieDeConnexion;
	}

	public String getInterfaceAvecOrdinateur() {
		return interfaceAvecOrdinateur;
	}

	public void setInterfaceAvecOrdinateur(String interfaceAvecOrdinateur) {
		this.interfaceAvecOrdinateur = interfaceAvecOrdinateur;
	}

	@Override
	public String toString() {
		return "peripherique [technologieDeConnexion=" + technologieDeConnexion + ", interfaceAvecOrdinateur="
				+ interfaceAvecOrdinateur + ", Refrence=" + Refrence + ", getTechnologieDeConnexion()="
				+ getTechnologieDeConnexion() + ", getInterfaceAvecOrdinateur()=" + getInterfaceAvecOrdinateur()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

}
