package exemplos;

public class TestaConta {

	public static void main(String[] args) {
		
		Conta c1;
		c1 = new Conta();
		
		c1.titular = new Cliente();
		c1.titular.nome = "Hugo";
		c1.titular.sobrenome = "Kuribayashi";
		c1.titular.email = "hkuribayashi@gmail.com";
		
		c1.saca(1000.0);
		c1.deposita(5000.0);
		c1.saca(300.0);
		
		System.out.println("Saldo da Conta c1: "+c1.saldo);
		
		Conta c2 = new Conta();
		c2.deposita(3400.00);
		c2.transfere(c1, 199.00);
		
		System.out.println("Saldo da Conta c1: "+c1.saldo);
		System.out.println("Saldo da Conta c2: "+c2.saldo);
	}
}
