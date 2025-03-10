package mtd_destrutor;

public class Dados_Automovel {
	public static void main (String []args) {
		
		Automovel auto = new Automovel ("Volksvagen", "Fusca", "verde", 6897.99);
		System.out.println(auto.mostra_Automovel());
		
		auto = null;
		System.gc();
		System.out.println(auto.mostra_Automovel());
	}
}
