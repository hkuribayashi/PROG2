package atividade1;

public class TestaPorta {

	public static void main(String[] args) {
		
		Porta p1 = new Porta();
		p1.cor = "Azul";
		System.out.println(p1.cor);
		
		Porta p2;
		p2 = new Porta(1.0, 2.0, 1.0, "Branca", false);
		System.out.println(p2.cor);
		
	}
}
