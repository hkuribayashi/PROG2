package exemplos0803;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String n, Double s) {
		super(n, s);
	}
	
	@Override
	public Double calcularBonificacao() {
		return this.salario * 0.12;
	}

}
