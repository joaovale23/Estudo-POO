package material;

public class Caneta {
	String marca;
	String cor;
	String tipo;
	
	Caneta (){
		super();
	}
	
	public void set_marca(String marca) {
		this.marca = marca;
	}
	public void set_cor(String cor) {
		this.cor= cor;
	}
	public void set_tipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String get_marca() {
		return marca;
	}
	public String get_cor() {
		return cor;
	}
	public String get_tipo() {
		return tipo;
	}
}
