package VisiteurSolde;



public interface IElementSolde {

	public void accept(IVisiteurSolde v) ;

	public double getSolde();
	
}
