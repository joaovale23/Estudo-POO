package getset;

import javax.swing.JOptionPane;

public class Loja_Carro {
	public static void main(String args[]){
		
		Carro ca = new Carro();
		
		ca.setMarca(JOptionPane.showInputDialog("digite a marca:"));
		ca.setModelo(JOptionPane.showInputDialog("digite o modelo:"));
		ca.setCor(JOptionPane.showInputDialog("digite a cor:"));
		ca.setPreco(Double.parseDouble(JOptionPane.showInputDialog("digite o preço:")));
		
		ca.Informa_carro();
		
	}
}
