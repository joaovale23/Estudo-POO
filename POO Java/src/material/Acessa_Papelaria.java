package material;

public class Acessa_Papelaria {
	public static void main(String [] args) {
		
		Papelaria a = new Papelaria();
		a.set_caderno("brochura");
		System.out.println("caderno tipo: " + a.get_caderno());
		
		Papelaria b = new Papelaria("lápis de cor");
		System.out.println("lápis tipo: " + b.get_lapis() + "\n");
		
		Material_Escolar c = new Material_Escolar();
		
		Material_Escolar d = new Material_Escolar(33.84, 20);
		System.out.println("preco do caderno R$ " + d.get_preco_caderno());
		System.out.println("quantidade de caixas de lápis de cor: " + d.get_quantidade_caixas_lapis());
		
		Caneta j = new Caneta();
		j.set_marca("BIC");
		j.set_cor("preta");
		j.set_tipo("esferográfica");
		System.out.println("\nCaneta " + j.get_tipo() + " " + j.get_cor() + " da " + j.get_marca());
	}
}
