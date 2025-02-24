package getset;

public class Registra_Contribuinte {
	public static void main(String [] args) {
		
		Dados_Contribuinte dados = new Dados_Contribuinte();
		
		dados.setNome("João");
		dados.setCPF("111.111.111-01");
		dados.setCNPJ("123 345 /987");
		dados.setCartao("1234-3456-5678-6789");
		System.out.println("Nome do Contribuinte: " + dados.getNome());
		System.out.println("CPF do Contribuinte: " + dados.getCPF());
		System.out.println("CNPJ do Contribuinte: " + dados.getCNPJ());
		System.out.println("Cartão do Contribuinte: " + dados.getCartao());
	}
}
