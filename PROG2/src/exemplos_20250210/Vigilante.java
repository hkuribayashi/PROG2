package exemplos_20250210;

public class Vigilante extends Funcionario{

	public Vigilante(String nome, Double salario) {
		super(nome, salario);
	}

	@Override
	public Double calcularBonificacao() {
		return this.salario * 0.11;
	}
}
