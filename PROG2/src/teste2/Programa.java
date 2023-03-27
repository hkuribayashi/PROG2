package teste2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Numero de Portas: ");
		Integer nPortas = leitor.nextInt();
		
		System.out.println("Capacidade do Carro: ");
		Integer cap = leitor.nextInt();
		
		System.out.println("Numero de Rodas: ");
		Integer nRodas = leitor.nextInt();
		
		System.out.println("Informe a COr: ");
		String cor = leitor.next();
		
		System.out.println("Informe a Placa: ");
		String placa = leitor.next();
		
		leitor.close();
		
		Transporte t1 = 
		 new Automovel(cap, nRodas, cor, placa, nPortas);
		
		System.out.println(t1);
		
	}
}
