package VisiteurSolde;

public class Manager implements IElementSolde {
	
	
	private double soldeManager=0 ;
	private double salairebase=0 ;
	private double indice=0 ;
	private double prime=0 ;
	private double impot =0;
  
	
	
	public Manager() {
		super();
		
	}
	public Manager(double salairebase, double indice, double prime, double impot) {
		super();
		this.salairebase = salairebase;
		this.indice = indice;
		this.prime = prime;
		this.impot = impot;
	}

      

	@Override
	public void accept(IVisiteurSolde v) {
		v.visiteurManager(this);
	}

	
	public double getSoldeManager() {
		return	 getIndice()*getSalairebase()+getPrime()-getImpot();
	}
	
	public void setSoldeManager(double soldeManager) {
		this.soldeManager = soldeManager;
	}
	
	
	public double getSalairebase() {
		return salairebase;
	}
	
	public void setSalairebase(double salairebase) {
		this.salairebase = salairebase;
	}
	
	public double getIndice() {
		return indice;
	}
	
	public void setIndice(double indice) {
		this.indice = indice;
	}
	
	public double getPrime() {
		return prime;
	}
	
	public void setPrime(double prime) {
		this.prime = prime;
	}
	
	public double getImpot() {
		return impot;
	}
	
	public void setImpot(double impot) {
		this.impot = impot;
	}
	
	
	@Override
	public double getSolde() {
		
		return getSoldeManager();
	}

}
