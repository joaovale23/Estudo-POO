package heranca;

public class Conceito_Heranca {
	
	public static void main(String args[]) {
	
		Classe_Filha_2 a = new Classe_Filha_2();
		Classe_Filha_3 b = new Classe_Filha_3();
		
		a.set_atributo_1("valor do atributo 1");
		a.set_atributo_2("valor do atributo 2");
		System.out.println(a.get_atributo_1());
		System.out.println(a.get_atributo_2());
		
		b.set_atributo_1("valor do atributo 1 novo");
		b.set_atributo_2("valor do atributo 2 novo");
		System.out.println(b.get_atributo_1());
		System.out.println(b.get_atributo_2());
	
	}
	
}
