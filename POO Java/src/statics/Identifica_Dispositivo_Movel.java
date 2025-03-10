package statics;

public class Identifica_Dispositivo_Movel {
	public static void main(String []args) {
		Dispositivo_Movel a = new Dispositivo_Movel();
		a.identifica_numero("13 99655 8666");
		a.identifica_usuario("Carla");
		
		Dispositivo_Movel b = new Dispositivo_Movel();
		b.identifica_numero("13 99777 6688");
		b.identifica_usuario("Giovana");
		
		System.out.println("número do telefone " + a.numero);
		System.out.println("número do telefone " + a.usuario);
		
		System.out.println("número do telefone " + b.numero);
		System.out.println("número do telefone " + b.usuario);
		
		b.DDD = 17;
		a.DDD = 16;
		
		System.out.println("número do telefone " + b.DDD);
		System.out.println("número do telefone " + a.DDD);
	}
}
