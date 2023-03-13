package exemplos1303;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Quantos gatos devem ser criados:");
		Integer quantidade = leitor.nextInt();
		
		List<Gato> lista = new ArrayList<Gato>();
		
		for (int i=0; i<quantidade; i++) {
			
			System.out.println("Qual o nome: ");
			String nome = leitor.nextLine();
			
			System.out.println("Qual a cor: ");
			String cor = leitor.nextLine();
			
			System.out.println("Qual a idade: ");
			Integer idade = leitor.nextInt();
			
			System.out.println("Qual o peso:");
			Double peso = leitor.nextDouble();
			
			Gato g1 = new Gato(nome, cor, idade, peso);
			lista.add(g1);
		}
		
		System.out.println("Total de Gatos: "+lista.size());
	}
}
