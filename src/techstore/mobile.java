package techstore;

abstract class mobile extends Appareil_informatique{
	double appareilPhotoArriere;
	double appareilPhotoFrontal;
	int nbSim;
	long capaciteBatterie;
	public mobile(int id, String nom, double prix, double resolutionEcran, String processeur, long ram, SystemExploitation SystemeExploitation, double AA,double AF,int SIM,long CB) {
		super(id,nom,prix,resolutionEcran,processeur,ram,SystemeExploitation);
		this.appareilPhotoArriere=AA;
		this.appareilPhotoFrontal=AF;
		this.nbSim=SIM;
		this.capaciteBatterie=CB;
	}
	public double getAppareilPhotoArriere() {
		return appareilPhotoArriere;
	}
	public void setAppareilPhotoArriere(double appareilPhotoArriere) {
		this.appareilPhotoArriere = appareilPhotoArriere;
	}
	public double getAppareilPhotoFrontal() {
		return appareilPhotoFrontal;
	}
	public void setAppareilPhotoFrontal(double appareilPhotoFrontal) {
		this.appareilPhotoFrontal = appareilPhotoFrontal;
	}
	public int getNbSim() {
		return nbSim;
	}
	public void setNbSim(int nbSim) {
		this.nbSim = nbSim;
	}
	public long getCapaciteBatterie() {
		return capaciteBatterie;
	}
	public void setCapaciteBatterie(long capaciteBatterie) {
		this.capaciteBatterie = capaciteBatterie;
	}
	
	@Override
	public double getPrix() {
	    return super.getPrix();
	}
	
	@Override
	public int garantirAppareil() {
		if ( this.getPrix() > 1500.0) {
			return 2;
		}
		else {
			return 1;
		}
	};
	
	@Override
	public String toString() {
		return "mobile [appareilPhotoArriere=" + appareilPhotoArriere + ", appareilPhotoFrontal=" + appareilPhotoFrontal
				+ ", nbSim=" + nbSim + ", capaciteBatterie=" + capaciteBatterie + ", resolutionEcran=" + resolutionEcran
				+ ", processeur=" + processeur + ", ram=" + ram + ", SystemeExploitation=" + SystemeExploitation
				+ ", Refrence=" + Refrence + "]";
	}
	
	
	
	
	
}
