package classe3;
import javax.swing.JOptionPane;

public class Atendente_livraria {
	public static void main(String []args) {
		
		//variavel de instancia
		//objeto
		Livraria cultura  = new Livraria();
		
		String a, b, c, d, e, i, x;
		int f, g;
		double h;
		
		JOptionPane.showMessageDialog(null,"Categorias:\n Digite 1 para romance\n Digite 2 para espírita\n Digite 3 para Informática\n Digite 4 para Terror\n" );
		
		a = JOptionPane.showInputDialog(null,"Categoria");
		f = Integer.parseInt(a);
		
		if(f<1 || f>4)
		{
			JOptionPane.showMessageDialog(null,"Categoria inválida");
		}
		else{
		do 
		{
			x =	JOptionPane.showInputDialog(null,"Código do livro");
			 if(Integer.parseInt(x)<0)
				 JOptionPane.showMessageDialog(null,"Código do livro inválido");
		}
		while(Integer.parseInt(x)<0);
		
		b = JOptionPane.showInputDialog(null,"Autor");
		c = JOptionPane.showInputDialog(null,"Editora");
		d = JOptionPane.showInputDialog(null,"Livro");
		
		do
		{
			 e = JOptionPane.showInputDialog(null,"Quantidade");
			 g = Integer.parseInt(e);
			 
			 if(g<0)
				 JOptionPane.showMessageDialog(null,"Quantidade Inválida");
			 
		}
		while(g<0);
		
		do{
			i = JOptionPane.showInputDialog(null,"Preço");
			h = Double.parseDouble(i);
				
			if(h<0)
				 JOptionPane.showMessageDialog(null,"Preço Inválido");
			
		}while(h<0);
		
		
		cultura.id_livro=x;
		cultura.autor=b;
		cultura.editora=c;
		cultura.livro=d;
		cultura.quantidade=g;
		cultura.preco=h;
		}
		
		cultura.Informa_Livros(f);
		
		
	}
}