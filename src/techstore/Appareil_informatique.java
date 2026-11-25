package techstore;

abstract class Appareil_informatique extends Article implements Garantissable{
	public double resolutionEcran;
	public String processeur;
	public long ram;
	public SystemExploitation SystemeExploitation;
	
	
	public Appareil_informatique(int id, String nom, double prix, double resolutionEcran, String processeur, long ram, SystemExploitation SystemeExploitation) {
		super(id,nom,prix);
	
		this.resolutionEcran = resolutionEcran;
		this.processeur = processeur;
		this.ram = ram;
		this.SystemeExploitation = SystemeExploitation;
	}
	
	@Override
	public abstract int garantirAppareil();
	
	
	

	public double getResolutionEcran() {
		return resolutionEcran;
	}

	public void setResolutionEcran(double resolutionEcran) {
		this.resolutionEcran = resolutionEcran;
	}

	public String getProcesseur() {
		return processeur;
	}

	public void setProcesseur(String processeur) {
		this.processeur = processeur;
	}

	public long getRam() {
		return ram;
	}

	public void setRam(long ram) {
		this.ram = ram;
	}

	public SystemExploitation getSystemeExploitation() {
		return SystemeExploitation;
	}

	public void setSystemeExploitation(SystemExploitation systemeExploitation) {
		SystemeExploitation = systemeExploitation;
	}

	@Override
	public String toString() {
		return "Appareil_informatique [resolutionEcran=" + resolutionEcran + ", processeur=" + processeur + ", ram="
				+ ram + ", SystemeExploitation=" + SystemeExploitation + "]";
	}

	
}