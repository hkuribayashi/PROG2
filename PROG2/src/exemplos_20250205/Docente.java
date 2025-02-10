package exemplos_20250205;

public class Docente extends Funcionario{
	
	private String areaAtuacao;
	
	public Docente(String nome, String email, Double salario, 
					  Titulacao titulacao, String areaAtuacao) {
		super(nome, email, salario, titulacao);
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public Double retrubuicaoTitulacao() {
		Double retribuicao = 2000.0;
		if (this.titulacao == Titulacao.MESTRADO) {
			retribuicao += 1000.0;
		}else if(this.titulacao == Titulacao.DOUTORADO){
			retribuicao += 3000.0;
		}
		return retribuicao;
	}
}
