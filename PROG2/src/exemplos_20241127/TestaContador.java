package exemplos_20241127;

public class TestaContador {

	public static void main(String[] args) {
		Contador c1 = new Contador();
		
		c1.incrementaContador();
		c1.incrementaContador();
		c1.decrementarContador();
		c1.incrementaContador();
		
		System.out.println(c1.getContagem());

	}

}
