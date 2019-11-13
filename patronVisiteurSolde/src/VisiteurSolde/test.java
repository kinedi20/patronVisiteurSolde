package VisiteurSolde;

//ecrit par thiara diagne

public class test {

	public static void main(String[] args) {
		
		Directeur d1 = new Directeur(1000,34,123);
		System.out.println(" le solde du directeur vaut : "+d1.getSolde());
	    Manager m1 = new Manager(120,35,1000,233);
	    System.out.println(" le solde du manager vaut : "+m1.getSolde());
	    Commerciaux c1 = new Commerciaux(120);
	    System.out.println(" le solde des commerciaux vaut : "+c1.getSolde());
	    Ouvrier o1 = new Ouvrier(120,100);
	    System.out.println(" le solde des ouvriers vaut : "+o1.getSolde());
	    
		
	}

}
