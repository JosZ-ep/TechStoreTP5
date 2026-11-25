package techstore;

abstract class Ordinateur extends Appareil_informatique implements Garantissable{
	long discqueDur;
	String carteGraphie;
	
	public Ordinateur (int id, String nom, double prix, double resolutionEcran, String processeur, long ram, SystemExploitation SystemeExploitation,long DD,String GPU){
		super(id,nom,prix,resolutionEcran,processeur,ram,SystemeExploitation);
		this.carteGraphie=GPU;
		this.discqueDur=DD;
	}

	@Override
	public abstract int garantirAppareil();
	
	public long getDiscqueDur() {
		return discqueDur;
	}

	public void setDiscqueDur(long discqueDur) {
		this.discqueDur = discqueDur;
	}

	public String getCarteGraphie() {
		return carteGraphie;
	}

	public void setCarteGraphie(String carteGraphie) {
		this.carteGraphie = carteGraphie;
	}
	
}
