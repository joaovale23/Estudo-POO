package exc_construtor;

public class Acessa_Plano {
	public static void main (String [] args) {
		Plano_Ensino a = new Plano_Ensino("Inglês", "inglês básico", "média trabalhos", "English One");
		Plano_Ensino b = new Plano_Ensino();
		
		b.set_materia("Programação Orientada a Objetos");
		b.set_conteudo_programatico("Introdução ao paradigma POO");
		b.set_criterio_avaliacao("Exercícios + provas");
		b.set_bibliografia("Java Book");
		
		System.out.println("Matéria:\t" + a.get_materia());
		System.out.println("Conteúdo programático:\t" + a.get_conteudo_programatico());
		System.out.println("Critério de avaliação:\t" + a.get_criterio_avaliacao());
		System.out.println("Bibliografia:\t" + a.get_bibliografia());
		
		System.out.println("\nMatéria:\t" + b.get_materia());
		System.out.println("Conteúdo programático:\t" + b.get_conteudo_programatico());
		System.out.println("Critério de avaliação:\t" + b.get_criterio_avaliacao());
		System.out.println("Bibliografia:\t" + b.get_bibliografia());
	}
}
