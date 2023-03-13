package exercicio2;

import br.banco.sistema.Conta;

public class TestaConta {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente("Hugo", 100.0);
		
		c1.sacar(150.0);
		System.out.println(c1);
		
		c1.depositar(2.0);
		System.out.println(c1);
		
		Conta cp1 = new ContaPoupanca(0.1, "Ana", 1000.0);
		//System.out.println( cp1.calcularRendimento() );

	}

}
