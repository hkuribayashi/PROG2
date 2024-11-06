package exemplos_20241106;

public class TestadorDeContas {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Hugo", "Kuribayashi", 
												"082089374283");
		Conta c1 = new Conta(31, 100.0, cl1);
		
		
		Cliente cl2 = new Cliente ("Julia", "Kuribayashi", 
												"230874023");
		Conta c2 = new Conta (32, 100.0, cl2);
		
		
		c2.transfere(100.0, c1);
		System.out.println("Saldo C1: "+c1.saldo);
		System.out.println("Limite C1: "+c1.limite);
		
		System.out.println("Saldo C2: "+c2.saldo);
		System.out.println("Limite C2: "+c2.limite);
		
	}

}
