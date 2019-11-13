package VisiteurSolde;

public class concretVisiteur implements IVisiteurSolde {
	
	
	private double soldevisiteur ;
	
	
	public concretVisiteur() {
		super();
			}

	public double getSoldevisiteur() {
		return soldevisiteur;
	}

	public void setSoldevisiteur(double soldevisiteur) {
		this.soldevisiteur = soldevisiteur;
	}
	
	public double  getTaille() {
		
		return soldevisiteur;
		
	}
	
	public void setTaille(double d) {
		soldevisiteur=d;
		
	}

	@Override
	public void visiteurDirecteur(Directeur d) {
		this.setTaille(getTaille() + d.getSolde());
	}

	@Override
	public void visiteurManager(Manager m) {
		this.setTaille(getTaille() + m.getSolde());
	}

	@Override
	public void visiteurCommerciaux(Commerciaux c) {
		this.setTaille(getTaille() + c.getSolde());
	}

	@Override
	public void visiteurOuvrier(Ouvrier o) {
		this.setTaille(getTaille() + o.getSolde());
	}

}
