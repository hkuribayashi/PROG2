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
		
		Porta p1 = new Porta(70.0, 2.0, 0.01);
		p1.abrir();
		p1.fechar();
		p1.pintar(Cor.PRETA);
		System.out.println(p1);
		
	
	}

}
