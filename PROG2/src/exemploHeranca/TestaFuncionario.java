package exemploHeranca;

import exemplos2702.Funcionario;

public class TestaFuncionario {
	
	public Double totalDeBonificacoes = 0.0;
	
	public static void main(String[] args) {
		
		Funcionario hugo = new Funcionario();
	
	}
	
	public void calcularSomaBonificacoes(Funcionario f) {
		this.totalDeBonificacoes += f.calculaBonificacao();
	}

}
