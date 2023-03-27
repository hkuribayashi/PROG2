package atividade6;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Sistema {
	
	private static List<Produto> produtos = new ArrayList<>();
	
	public static Double calcularSomaProdutos() {
		Double soma = 0.0;
		
		for (Produto p: produtos) {
			if (p instanceof Notebook) {
				Notebook n1 = (Notebook) p;
				soma += n1.getPreco() + n1.calcularImposto();
			}else {
				Desktop d1 = (Desktop) p;
				soma += d1.getPreco() + d1.calcularImposto();
				for (Monitor m: d1.getMonitores()) {
					soma += m.getPreco() + m.calcularImposto();
				}
			}
		}
		
		return soma;
	}

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		System.out.println("Quantos Produtos?");
		Integer qtd = leitor.nextInt();
		
		for (int i=0; i<qtd; i++) {
			System.out.println("Criando Produto: "+i);
			System.out.println("Desktop/Notebook D/N?");
			String escolha1 = leitor.next();
			if (escolha1.equals("D")) {
				Desktop d1 = criarDesktop(leitor);
				Sistema.produtos.add(d1);
			}else {
				Notebook n1 = criarNotebook(leitor);
				Sistema.produtos.add(n1);
			}
		}
		
		System.out.println("O valor total de produtos é: ");
		System.out.println( Sistema.calcularSomaProdutos() );
		
		leitor.close();
	}

	private static Desktop criarDesktop(Scanner leitor) {
		System.out.println("Preço: ");
		Double preco = leitor.nextDouble();
		System.out.println("Marca: ");
		String marca = leitor.next();
		System.out.println("MemoriaRAM: ");
		Integer mem = leitor.nextInt();
		System.out.println("Placa Grafica: ");
		String placa = leitor.next();
		System.out.println("Tamanho do Gabinete:");
		Integer tamG = leitor.nextInt();
		Desktop d1 = new Desktop(preco, marca,
								 mem, placa, tamG);			
		
		System.out.println("Quantos Monitores?");
		Integer qtdM = leitor.nextInt();
		for (int j=0; j<qtdM; j++) {
			System.out.println("Preco do Monitor: ");
			Double precM = leitor.nextDouble();
			System.out.println("Marca do Monitor: ");
			String marcM = leitor.next();
			System.out.println("Tamanho do Monitor: ");
			Double tamM = leitor.nextDouble();
			
			d1.getMonitores().add(
							new Monitor(precM, marcM, tamM));
		}
		return d1;
	}

	private static Notebook criarNotebook(Scanner leitor) {
		//Criar um Notebook
		System.out.println("Preço: ");
		Double preco = leitor.nextDouble();
		System.out.println("Marca: ");
		String marca = leitor.next();
		System.out.println("Capacidade: ");
		Double cap = leitor.nextDouble();
		System.out.println("MemoriaRAM: ");
		Integer mem = leitor.nextInt();
		System.out.println("Placa Grafica: ");
		String placa = leitor.next();
		System.out.println("Tamanho Tela: ");
		Double tamT = leitor.nextDouble();
		
		Notebook n1 = new Notebook(preco, 
								   marca,
								   mem, placa,
								   cap, tamT);
		return n1;
	}
}
