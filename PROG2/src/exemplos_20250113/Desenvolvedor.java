package exemplos_20250113;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String n, Double s) {
		super(n, s);
	}
	
	public Double calcularTempoDeFerias() {
		return 0.0;
	}
	
	@Override
	public Double calcularBonificacao() {
		return super.calcularBonificacao() +
				this.salario * 0.02;
	}
}
