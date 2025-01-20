package exemplos_20250120;

public class Loja {

	public static void main(String[] args) {
		
		Computador c1 = new Notebook();
		
		Monitor m1 = new Monitor();
		Monitor m2 = new Monitor();
		
		Desktop c2 = new Desktop();
		c2.getMonitores().add(m1);
		c2.getMonitores().add(m2);
		
	}
}
