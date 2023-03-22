package exemplo2103;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import exemplos2003.Analista;
import exemplos2003.Funcionario;
import exemplos2003.Gerente;

public class ExemploLista2 {

	public static void main(String[] args) {
		
		List<Funcionario> funcionarios =
							new ArrayList<>();
		
		Analista hugo = new Analista("Hugo", 1000.0);
		Gerente ana = new Gerente("Ana", 1000.0);
		
		funcionarios.add(ana);
		funcionarios.add(hugo);
		
		Collections.sort(funcionarios);
		
 		
		
	}
}
