package exemplos0803;

public class Gerente extends Funcionario{

	public Gerente(String n, Double s) {
		super(n, s);
	}
	
	@Override
	public Double calcularBonificacao() {
		//return super.calcularBonificacao() + this.salario * 0.05;
		return this.salario * 0.15;
	}

}
