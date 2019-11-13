package VisiteurSolde;

public class Ouvrier implements IElementSolde {
	
	private double soldeOuvrier=0;
	private double salairehoraire=0 ;
	private double nbheure=0;
	

	public Ouvrier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    

	public Ouvrier(double salairehoraire, double nbheure) {
		super();
		this.salairehoraire = salairehoraire;
		this.nbheure = nbheure;
	}
	



	public double getSoldeOuvrier() {
		return getSalairehoraire()+getNbheure()+5000;
	}



	public void setSoldeOuvrier(double soldeOuvrier) {
		this.soldeOuvrier = soldeOuvrier;
	}



	public double getSalairehoraire() {
		return salairehoraire;
	}



	public void setSalairehoraire(double salairehoraire) {
		this.salairehoraire = salairehoraire;
	}



	public double getNbheure() {
		return nbheure;
	}



	public void setNbheure(double nbheure) {
		this.nbheure = nbheure;
	}



	@Override
	public void accept(IVisiteurSolde v) {
		v.visiteurOuvrier(this);

	}

	@Override
	public double getSolde() {
		
		return getSoldeOuvrier();
	}

}
