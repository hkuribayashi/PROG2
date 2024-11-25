package exemplos_20241125;


public class TestaConta {

	public static void main(String[] args) {
		
		Cliente hugo = new Cliente("Hugo", 
				"Kuribayashi", "232983");
		
		Conta c1 = new Conta(11, hugo, 10000.0);
		
		c1.depositar(13133.0);
		c1.sacar(121211.0);
		c1.depositar(123989.0);
		c1.sacar(87863.0);
		
		System.out.println("Titular: "+c1.getTitular().getNome());
		System.out.println("Saldo atual: "+c1.getSaldo());
		
		
		
		
		
	}
}
