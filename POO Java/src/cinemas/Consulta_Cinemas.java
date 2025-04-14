package cinemas;

public class Consulta_Cinemas {
	public static void main(String args[]){
		Cine_Roxy roxy = new Cine_Roxy();
		Cine_Caiçara caiçara = new Cine_Caiçara("Antigo cinema da\n"
		+ "Av. Conselheiro Nébias - Boqueirão");
		Cinemas_do_Shopping cinemark = new Cinemas_do_Shopping("3° andar", "Cinemark");
		
		caiçara.setlocalização("Avenida Conselheiro Nébias com a Praia");
		caiçara.setnome("Cine Caiçara");
		System.out.println("Cine \t" + caiçara.getnome() + "\nficava na esquina da:\t"
		+ caiçara.getlocalização());
		System.out.println("Cinema " + cinemark.getfranquia() + "fica no " + cinemark.getandar());
	}
}
