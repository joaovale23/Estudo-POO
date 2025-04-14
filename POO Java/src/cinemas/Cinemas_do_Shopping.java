package cinemas;

public class Cinemas_do_Shopping extends Cinemas_de_Santos{
	String andar;
	String franquia;
	
	Cinemas_do_Shopping(String andar, String franquia){
		this.andar = andar;
		this.franquia = franquia;
	}
	
	public String getandar() {
		return andar;
	}
	
	public String getfranquia() {
		return franquia;
	}
}
