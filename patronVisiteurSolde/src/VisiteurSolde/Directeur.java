package VisiteurSolde;

public class Directeur implements IElementSolde {
	
	
	
	private double soldeDirecteur=0 ;
	private double salairebase=0 ;
	private double indice=0 ;
	private double bonus=0 ;
	

	
	public Directeur() {
		super();
		// TODO Auto-generated constructor stub
	}
  
    
	
	 
	public Directeur(double salairebase, double indice, double bonus) {
		super();
		this.salairebase = salairebase;
		this.indice = indice;
		this.bonus = bonus;
	}




	public double getSoldeDirecteur() {
		return getIndice()*getSalairebase()+getBonus();
	}

	public void setSoldeDirecteur(double soldeDirecteur) {
		this.soldeDirecteur = soldeDirecteur;
	}
	
	
	

	public double getSalairebase() {
		return salairebase;
	}



	public void setSalairebase(double salairebase) {
		this.salairebase = salairebase;
	}



	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getIndice() {
		return indice;
	}




	public void setIndice(double indice) {
		this.indice = indice;
	}




	@Override
	public void accept(IVisiteurSolde v) {
		
		v.visiteurDirecteur(this);

	}

	@Override
	public double getSolde() {
		
		return getSoldeDirecteur();
	}

}
