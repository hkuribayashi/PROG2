package exemplos2003;

public class Analista extends Funcionario {

	public Analista(String nome, Double salario) {
		super(nome, salario);
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.13;
	}

	

}
