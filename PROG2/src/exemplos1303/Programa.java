package exemplos1303;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Qual o tipo de "
							+ "animal que dever criado:");
		String tipo = leitor.nextLine();
		
		System.out.println("Qual o nome: ");
		String nome = leitor.nextLine();
		
		System.out.println("Qual a cor: ");
		String cor = leitor.nextLine();
		
		System.out.println("Qual a idade: ");
		Integer idade = leitor.nextInt();
		
		System.out.println("Qual o peso:");
		Double peso = leitor.nextDouble();
		
		Animal a;
		
		if (tipo.equals("gato")) {
			a = new Gato(nome, cor, idade, peso);
			a.fazerBarulho();
		}else if (tipo.equals("cachorro")) {
			a = new Cachorro(nome, cor, idade, peso);
			a.fazerBarulho();
		}else if (tipo.equals("ave")) {
			a = new Ave(nome, cor, idade, peso);
			a.fazerBarulho();
		}else {
			System.out.println("Tipo de animal invalido");
		}
		
		/*
		 * Animal a1 = new Gato("Luke", "cinza", 5, 5.0); a1.fazerBarulho();
		 * a1.subirEmArvore();
		 * 
		 * Animal a2 = new Ave("aa", "amarelo", 1, 0.5); a2.fazerBarulho();
		 * 
		 * Gato g1 = new Gato("felix", "preto", 1, 2.0); g1.subirEmArvore();
		 */
		
	}
}
