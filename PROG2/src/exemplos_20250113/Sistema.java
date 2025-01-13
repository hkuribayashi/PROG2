package exemplos_20250113;

import java.util.ArrayList;
import java.util.List;

public class Sistema {

	private Double somaBonificacoes;
	
	private List<Funcionario> funcionarios;
	
	public Sistema() {
		this.somaBonificacoes = 0.0;
		this.funcionarios = new ArrayList<Funcionario>();
	}
	
	public void adicionarFuncionario(Funcionario f) {
		this.funcionarios.add(f);
	}
	
	public void calcularSomaBonificacoes() {
		for (int i=0; i<this.funcionarios.size(); i++) {
			Funcionario f = this.funcionarios.get(i);
			this.somaBonificacoes += f.calcularBonificacao();
		}
	}
	
	public Double getSomaBonificacoes() {
		return this.somaBonificacoes;
	}
}



