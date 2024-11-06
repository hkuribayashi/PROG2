package exemplos_20241106;

public class TestaReferencias {

	public static void main(String[] args) {
		Cliente cl1 = new Cliente("Hugo", "K", "82378273");
		Cliente cl2 = new Cliente("Julia", "K", "29832938");
		
		Conta c1 = new Conta(31, 100.0, cl1);
		Conta c2 = new Conta(41, 200.0, cl2);
		
		c1 = c2;
		c1.deposita(100.0);
		c2.deposita(100.0);
		
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		

	}

}
