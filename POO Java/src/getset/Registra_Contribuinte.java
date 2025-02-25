package getset;

import javax.swing.JOptionPane;

public class Registra_Contribuinte {
	public static void main(String [] args) {
		
		Dados_Contribuinte dados = new Dados_Contribuinte();
		
		String nome, CPF, CNPJ, cartao;
		
		dados.setNome(JOptionPane.showInputDialog("digite o nome: "));
		dados.setCPF(JOptionPane.showInputDialog("digite o CPF: "));
		dados.setCNPJ(JOptionPane.showInputDialog("digite o CNPJ: "));
		dados.setCartao(JOptionPane.showInputDialog("digite o cartao: "));
		System.out.println("Nome do Contribuinte: " + dados.getNome());
		System.out.println("CPF do Contribuinte: " + dados.getCPF());
		System.out.println("CNPJ do Contribuinte: " + dados.getCNPJ());
		System.out.println("Cartão do Contribuinte: " + dados.getCartao());
	}
}
