package exemplos2003;

public class Gerente extends Funcionario{

	public Gerente(String nome, Double salario) {
		super(nome, salario);
	}

	public Double calcularBonificacao() {
		return this.salario * 0.15;
	}
	
}
