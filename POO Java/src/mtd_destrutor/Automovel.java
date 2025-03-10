package mtd_destrutor;

public class Automovel {
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	
	Automovel(String marca, String modelo, String cor, double preco){
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
	
	String dados;
	
	public String mostra_Automovel() {
		dados = "\n"+"carro marca:" + "\t" + marca + "\n"
		+ "modelo:" + "\t" + modelo + "\n"
		+ "cor:" + "\t" + cor + "\n" + "preco: R$" + "\t" + preco;
		return dados;
	}
}
