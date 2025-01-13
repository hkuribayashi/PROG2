package exemplos_20250113;

public abstract class Gerente extends Funcionario{

	public Gerente(String n, Double s) {
		super(n, s);
	}
	
	public abstract Double calcularAposentadoria();
	
	@Override
	public Double calcularBonificacao() {
		//return this.salario * 0.15;
		return super.calcularBonificacao()
				+ this.salario * 0.05;
	}
}
