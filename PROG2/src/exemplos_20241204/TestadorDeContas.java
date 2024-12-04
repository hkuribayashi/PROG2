package exemplos_20241204;

public class TestadorDeContas {

	public static void main(String[] args) {
		
		System.out.println(Conta.totalDeContas);
		Conta.totalDeContas += 1;
		
		Conta c1 = new Conta();
		System.out.println(c1.totalDeContas);
		c1.totalDeContas += 1;
		
		Conta c2 = new Conta();
		System.out.println(c2.totalDeContas);
		
		

	}

}
