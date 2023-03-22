package exemplos2003;

public class Analista extends Funcionario {

	public Analista(String nome, Double salario) {
		super(nome, salario);
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.13;
	}

	@Override
	public int compareTo(Funcionario o) {
		
		// Se o objeto corrente (this) for maior que o parâmetro o, então retornar 1
		
		// Se o objeto corrente for menor que o parâmetro o, então retorna -1
		
		// Caso contrário retorne 0
		
		return 0;
	}

}
