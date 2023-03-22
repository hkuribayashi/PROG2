package exemplo2103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExemploListas {
	
	public static void imprimeLista(List l) {
		for (int i=0; i<l.size(); i++) {	
			System.out.println(i+": "+ l.get(i));
		}
	}
	
	public static void imprimeLista2(List<Double> l) {
		for (Double elemento: l) {
			System.out.println(elemento);
		}
	}
	

	public static void main(String[] args) {
		
		List<String> listaPalavras = new ArrayList<>();
		
		listaPalavras.add("Hugo");
		listaPalavras.add("Gabriel");
		listaPalavras.add("Julia");
		
		int tamanhoLista = listaPalavras.size();
		//System.out.println(tamanhoLista);
		
		//listaPalavras.add("João");
		listaPalavras.add(1, "João");
		
		//System.out.println( listaPalavras.get(0) );
		//System.out.println( listaPalavras.get(1) );
		//System.out.println( listaPalavras.get(2) );
		//System.out.println( listaPalavras.get(3) );
		
		tamanhoLista = listaPalavras.size();
		// System.out.println(tamanhoLista);
		
		List<Double> listaNotas = new ArrayList<>();
		
		listaNotas.addAll( 
			Arrays.asList(10.0, 2.5, 3.5, 4.5, 0.0, 7.5)
						 );
		
		imprimeLista(listaNotas);
		Collections.sort(listaNotas);
		System.out.println();
		imprimeLista(listaNotas);
		
		Double maior = Collections.max(listaNotas);
		Double menor = Collections.min(listaNotas);
		
		Collections.reverse(listaNotas);
		
		System.out.println(maior);
		System.out.println(menor);
		
		imprimeLista(listaPalavras);
		Collections.sort(listaPalavras);
		imprimeLista(listaPalavras);
		
		boolean r = listaPalavras.contains("Maria");
		System.out.println(r);
		
		listaPalavras.remove("João");
		imprimeLista(listaPalavras);
	}
}
