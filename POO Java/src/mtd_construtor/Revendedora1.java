package mtd_construtor;

public class Revendedora1 {
	
	public static void main (String args[]) {
		
		Automovel A = new Automovel();
		A.mostracarro();
		
		Automovel B = new Automovel(1977, "Volkswagen", "Fusca", 3888.00);
		B.mostracarro();
	}
	
}
