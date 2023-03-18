package exemplos1803;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		System.out.println("Qtos Computadores ?");
		Integer n = leitor.nextInt();
		
		int contador = 0;
		while(contador < n) {
			//Realizar aqui a criação dos Computadores
			System.out.println("Desktop ou Notebook? (d/n)");
			String resposta = leitor.next();
			
			System.out.println("Qual a marca do comp. ?");
			String mar = leitor.next();
			
			System.out.println("Qual a memoria RAM?");
			Integer mr = leitor.nextInt();
			
			System.out.println("Qual a placa Grafica?");
			String placa = leitor.next();
			
			System.out.println("Qual o valor?");
			Double valor = leitor.nextDouble();
			
			if (resposta.equals("d")) {
				System.out.println("Qual o tam. Gabinete?");
				Integer tamG = leitor.nextInt();
				
				System.out.println("Qual a marca do monit?");
				String marM = leitor.next();
				
				System.out.println("Qual o tam. do monit?");
				Double tamM = leitor.nextDouble();
				
				Monitor m = new Monitor(marM, tamM);
				
				Desktop d1 = new Desktop(mar, mr, placa, 
										  valor, tamG, m);
				
				System.out.println(d1);
				
			}else {
				System.out.println("Qual a capacidade bat?");
				Double cap = leitor.nextDouble();
				
				System.out.println("Qual o tamanho tela?");
				Double tamT = leitor.nextDouble();
				
				Notebook n1 = new Notebook(mar, mr, placa, 
										  valor, cap, tamT);
				
				System.out.println(n1);
				
			}
			
			contador++;
		}
		
		leitor.close();
	}
}
