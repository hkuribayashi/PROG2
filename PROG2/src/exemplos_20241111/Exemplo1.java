package exemplos_20241111;

import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o nome da Pessoa: ");
		String nome = sc.next();
		
		System.out.println("Informe a idade da Pessoa: ");
		Integer idade = sc.nextInt();
		
		Pessoa p = new Pessoa(nome, idade);
		p.fazAniversario();
		System.out.println(p);
		
		Casa c1 = new Casa(p, Cor.AZUL);
		System.out.println(c1);
		
		sc.close();
	
	}

}
