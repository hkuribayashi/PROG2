package teste2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// Instancia o leitor
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o numero de portas do carro: ");
		Integer numeroDePortas = leitor.nextInt();
		System.out.println("Informe a capacidade do Carro: ");
		Integer capacidade = leitor.nextInt();
		System.out.println("Informe o número de rodas do Carro: ");
		Integer numeroDeRodas = leitor.nextInt();
		System.out.println("Informe a placa do carro: ");
		String placa = leitor.next();
		System.out.println("Informe a cor do carro: ");
		String cor = leitor.next();
		
		// Fecha o leitor
		leitor.close();
		
		Transporte t1 = new Automovel(numeroDePortas, numeroDeRodas, 
									  cor, placa, capacidade);
		System.out.println(t1);
	}
}
