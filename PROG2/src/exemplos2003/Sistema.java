package exemplos2003;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
	
	private static Double totalDeBonificacoes = 0.0;
	private static List<Funcionario> funcionarios = 
										new ArrayList<>();
	
	public static void calculaSomaBonificacoes() {
		/*
		for (Funcionario f: funcionarios) {
			Sistema.totalDeBonificacoes += f.calcularBonificacao();
		}
		*/
		for (int i=0; i<funcionarios.size(); i++) {
			Funcionario f = funcionarios.get(i);
			Sistema.totalDeBonificacoes += f.calcularBonificacao();
		}
	}
	
	public static void main(String[] args) {		
		Gerente hugo = new Gerente("Hugo K", 1000.0);
		Funcionario jose = new Analista("Jose", 1000.0);
		
		// Insere os Funcionarios na Lista
		Sistema.funcionarios.add(jose);
		Sistema.funcionarios.add(hugo);
		
		Sistema.calculaSomaBonificacoes();
		System.out.println(Sistema.totalDeBonificacoes);
		
		
		
	}

}
