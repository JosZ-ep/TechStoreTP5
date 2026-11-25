package techstore;

abstract class OrdinateurPortable extends Ordinateur{
	long Batterie;
	public OrdinateurPortable(int id, String nom, double prix, double resolutionEcran, String processeur, long ram, SystemExploitation SystemeExploitation,long DD,String GPU,long al) {
		super(id,nom,prix,resolutionEcran,processeur,ram,SystemeExploitation,DD,GPU);
		this.Batterie = al;
	}
	public long getBatterie() {
		return Batterie;
	}
	public void setBatterie(long batterie) {
		Batterie = batterie;
	}
	
	@Override
	public int garantirAppareil() {
		return 2;
	}
	@Override
	public String toString() {
		return "OrdinateurPortable [Batterie=" + Batterie + ", discqueDur=" + discqueDur + ", carteGraphie="
				+ carteGraphie + ", resolutionEcran=" + resolutionEcran + ", processeur=" + processeur + ", ram=" + ram
				+ ", SystemeExploitation=" + SystemeExploitation + ", Refrence=" + Refrence + "]";
	}
	
	

}
