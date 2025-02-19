package encapsulamento_2;

import encapsulamento_1.Acesso_Numeros;

public class Verifica_Encapsulamento_2 {
	
	public static void main(String args []) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
		
		/*chave.a = 10; ENCAPSULAMENTO package-private
		 * NÃO PERMITE ACESSO DE FORA DO PACOTE*/
		chave.setNumero("a", 10);
		chave.b = 20;
		//chave.c = 30; NÃO É POSSÍVEL ACESSAR VARIÁVEL PRIVATE DIRETAMENTE
		chave.setNumero("c", 30);
		//chave.d = 40; NÃO É POSSÍVEL ACESSAR VARIÁVEL PROTECTED DIRETAMENTE DE FORA DO PACOTE
		chave.setNumero("d", 40);
		chave.mostra_numero();
		
	}	
	
}
