package exemplos0102;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta(2938, "Hugo", 100.0);
		
		//c1.numero = 2938; (não funciona mais)
		//c1.titular = "Hugo"; (não funciona mais)
		//c1.saldo = 100.0; (não funciona mais)
		
		System.out.println( c1.deposita(1000.0));
		System.out.println( c1.saca(200.0) );
		System.out.println( c1.deposita(299.0));
		System.out.println( c1.saca(27.0));
		System.out.println( c1.deposita(45.0));
		System.out.println( c1.saca(177.0) );
		
		System.out.println( c1.getSaldo() );

		
	}

}
