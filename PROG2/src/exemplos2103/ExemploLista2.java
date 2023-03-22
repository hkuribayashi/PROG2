package exemplos2103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exemplos2003.Analista;
import exemplos2003.Desenvolvedor;
import exemplos2003.Funcionario;
import exemplos2003.Gerente;

public class ExemploLista2 {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios =
							new ArrayList<>();
		
		Analista hugo = new Analista("Hugo", 1000.0);
		Gerente ana = new Gerente("Ana", 1500.0);
		Desenvolvedor joao = new Desenvolvedor("Joao", 1800.0);
		
		funcionarios.add(joao); // pegou a posicao 0
		funcionarios.add(ana); // pegou a posicao 1
		funcionarios.add(hugo); // pegou a posicao 2

	 	for (Funcionario f : funcionarios) {
			System.out.println(f.salario);
		}
	 	
	 	Collections.sort(funcionarios);
	 	
	 	for (Funcionario f : funcionarios) {
			System.out.println(f.salario);
	 	}
		
		
	}
}
