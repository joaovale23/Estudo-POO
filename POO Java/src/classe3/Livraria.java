package classe3;

import javax.swing.JOptionPane;

//objeto
public class Livraria {
	
	//atributos
	//objeto
	String editora;
	String autor;
	String livro;
	String id_livro;
	int quantidade;
	double preco;
	
	//método
	//objeto
	public void Informa_Livros(int codigo){
		
		switch(codigo) {
		 case 1:
			    
			 	 JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE\n"+
			 	 "CÓDIGO DO LIVRO:"+"1"+id_livro+
		         "\nLIVRO: "+ livro + 
		         "\nEDITORA: "+editora+
		         "\nAUTOR: "+autor+
		         "\nQUANTIDADE: "+quantidade+
		         "\nPREÇO: R$"+preco,"",JOptionPane.PLAIN_MESSAGE);
		 		 break;
		 		 
		 case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPÍRITA\n"+
				 "CÓDIGO DO LIVRO:"+"2"+id_livro+
		         "\nLIVRO: "+ livro + 
		         "\nEDITORA: "+editora+
		         "\nAUTOR: "+autor+
		         "\nQUANTIDADE: "+quantidade+
		         "\nPREÇO: R$"+preco,"",JOptionPane.PLAIN_MESSAGE);
		 		 break;
		 		 
		 case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTICA\n"+
				 "CÓDIGO DO LIVRO:"+"3"+id_livro+
		         "\nLIVRO: "+ livro + 
		         "\nEDITORA: "+editora+
		         "\nAUTOR: "+autor+
		         "\nQUANTIDADE: "+quantidade+
		         "\nPREÇO: R$"+preco,"",JOptionPane.PLAIN_MESSAGE);
		 		 break;
		 		 
		 case 4: JOptionPane.showMessageDialog(null, "CATEGORIA TERROR\n"+
				 "CÓDIGO DO LIVRO:"+"4"+id_livro+
		         "\nLIVRO: "+ livro + 
		         "\nEDITORA: "+editora+
		         "\nAUTOR: "+autor+
		         "\nQUANTIDADE: "+quantidade+
		         "\nPREÇO: R$"+preco,"",JOptionPane.PLAIN_MESSAGE);
		 		 break;
		
		 default:
			 System.out.println("Código não corresponde a nenhuma categoria de livro");
		 		 
		}
	}
}