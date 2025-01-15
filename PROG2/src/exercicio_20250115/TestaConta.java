package exercicio_20250115;

public class TestaConta {

	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente("Hugo", 1000.0);
		
		c1.depositar(300.0);
		
		c1.sacar(200.0);
		
		System.out.println( c1 );
	}

}
