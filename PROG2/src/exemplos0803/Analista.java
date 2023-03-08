package exemplos0803;

public class Analista extends Funcionario{

	public Analista(String n, Double s) {
		super(n, s);
	}

	@Override
	public Double calcularBonificacao() {
		return this.salario * 0.13;
	}
}
