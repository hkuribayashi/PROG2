package exemplos_20241113;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1;
		
		c1 = new Conta("01X", "Fulano", 1111, 10.0, "13/11/2024");
		
		System.out.println(c1.saldo);
		
		c1.deposita(100.0);
		
		c1.sacar(10.0);
		
		System.out.println(c1.saldo);
	}
}
