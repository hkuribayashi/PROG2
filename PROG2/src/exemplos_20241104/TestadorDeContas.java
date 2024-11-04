package exemplos_20241104;

public class TestadorDeContas {

	public static void main(String[] args) {

		Conta c1;
		
		c1 = new Conta(312, "Hugo", 100.0, 100.0);
		
		c1.saca(50.0);
		c1.deposita(90.0);
		c1.saca(-3000.0);
		
		System.out.println(c1.saldo);
		
	}

}
