package exemplos_20241106;

public class ComparadorContas {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Hugo", "K", "82378273");
		
		Conta c1 = new Conta(31, 100.0, cl1);
		Conta c2 = c1;
		
		if (c1 == c2) {
			System.out.println("Verdadeiro");
			
		}else System.out.println("Falso");
		

	}

}
