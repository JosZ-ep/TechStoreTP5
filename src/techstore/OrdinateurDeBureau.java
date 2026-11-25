package techstore;

abstract class OrdinateurDeBureau extends Ordinateur{
	String alimentation;
	public OrdinateurDeBureau(int id, String nom, double prix, double resolutionEcran, String processeur, long ram, SystemExploitation SystemeExploitation,long DD,String GPU,String al) {
		super(id,nom,prix,resolutionEcran,processeur,ram,SystemeExploitation,DD,GPU);
		this.alimentation = al;
	}
	public String getAlimentation() {
		return alimentation;
	}
	public void setAlimentation(String alimentation) {
		this.alimentation = alimentation;
	}
	@Override
	public String toString() {
		return "OrdinateurDeBureau [alimentation=" + alimentation + ", discqueDur=" + discqueDur + ", carteGraphie="
				+ carteGraphie + ", resolutionEcran=" + resolutionEcran + ", processeur=" + processeur + ", ram=" + ram
				+ ", SystemeExploitation=" + SystemeExploitation + ", Refrence=" + Refrence + "]";
	}
	
	@Override 
	public int garantirAppareil() {
		return 1;
	}

}
