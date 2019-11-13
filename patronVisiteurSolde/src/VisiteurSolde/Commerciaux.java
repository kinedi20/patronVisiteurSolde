package VisiteurSolde;
//ecrit par thiara diagne

public class Commerciaux implements IElementSolde {
	
	private double sodleCommerciaux=0;
	private double primeVente=0;

	public Commerciaux() {
		super();
		
	}

	public Commerciaux(double primeVente) {
		super();
		this.primeVente = primeVente;
	}

	
	
	public double getSodleCommerciaux() {
		return getPrimeVente()+1000;
	}

	public void setSodleCommerciaux(double sodleCommerciaux) {
		this.sodleCommerciaux = sodleCommerciaux;
	}

	public double getPrimeVente() {
		return primeVente;
	}

	public void setPrimeVente(double primeVente) {
		this.primeVente = primeVente;
	}

	@Override
	public void accept(IVisiteurSolde v) {
		v.visiteurCommerciaux(this);

	}

	@Override
	public double getSolde() {
		return getSodleCommerciaux();
	}

}
