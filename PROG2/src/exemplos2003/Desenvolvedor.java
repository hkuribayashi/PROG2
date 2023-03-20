package exemplos2003;

public class Desenvolvedor extends Funcionario {

	public Desenvolvedor(String nome, Double salario) {
		super(nome, salario);
	}
	
	public Double calcularBonificacao() {
		return this.salario * 0.12;
	}

}
