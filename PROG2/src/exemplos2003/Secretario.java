package exemplos2003;

public class Secretario extends Funcionario{

	public Secretario(String nome, Double salario) {
		super(nome, salario);
	}

	public Double calcularBonificacao() {
		return this.salario * 0.11;
	}

}
