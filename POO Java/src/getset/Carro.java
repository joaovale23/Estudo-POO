package getset;

public class Carro {
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	
	public void setMarca(String marca) {
		this.marca = marca; }
	
	public void setModelo(String modelo) {
		this.modelo = modelo; }
	
	public void setCor(String cor) {
		this.cor = cor; }
	
	public void setPreco(Double preco) {
		this.preco = preco; }
	
	public String getMarca() {
		return marca;}
	
	public String getModelo() {
		return modelo;}
	
	public String getCor() {
		return cor;}
	
	public Double getPreco() {
		return preco;}
	
	public void Informa_carro() {
		System.out.println(getMarca());
		System.out.println(getModelo());
		System.out.println(getCor());
		System.out.println(getPreco());
	}
}
