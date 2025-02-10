package exemplos_20250205;

public class Tecnico extends Funcionario {

	public Tecnico(String nome, String email, Double salario, 
											Titulacao titulacao) {
		super(nome, email, salario, titulacao);
	}

	@Override
	public Double retrubuicaoTitulacao() {
		Double retribuicao = 0.0;
		if (this.titulacao == Titulacao.GRADUACAO) {
			retribuicao = 0.125 * this.salario;
		}else if (this.titulacao == Titulacao.ESPECIALIZACAO) {
			retribuicao = 0.27 * this.salario;
		}else if (this.titulacao == Titulacao.MESTRADO) {
			retribuicao = 0.52 * this.salario;
		}else if (this.titulacao == Titulacao.DOUTORADO) {
			retribuicao = 0.71 * this.salario;
		}
		return retribuicao;
	}

}
