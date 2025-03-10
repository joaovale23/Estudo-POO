package exc_construtor;

public class Plano_Ensino {
	private String materia;
	private String conteudo_programatico;
	private String criterio_avaliacao;
	private String bibliografia;
	
	Plano_Ensino(){}
	Plano_Ensino(String materia, String conteudo_programatico, String criterio_avaliacao, String bibliografia){
		this.materia = materia;
		this.conteudo_programatico = conteudo_programatico;
		this.criterio_avaliacao = criterio_avaliacao;
		this.bibliografia = bibliografia;
	}
	
	public void set_materia(String materia) {
		this.materia = materia;
	}
	public void set_conteudo_programatico(String conteudo_programatico) {
		this.conteudo_programatico = conteudo_programatico;
	}
	public void set_criterio_avaliacao(String criterio_avaliacao) {
		this.criterio_avaliacao = criterio_avaliacao;
	}
	public void set_bibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public String get_materia() {
		return materia;
	}
	public String get_conteudo_programatico() {
		return conteudo_programatico;
	}
	public String get_criterio_avaliacao() {
		return criterio_avaliacao;
	}
	public String get_bibliografia() {
		return bibliografia;
	}
}
