package exemplos_20250205;

public abstract class Funcionario extends Pessoa{
	
	protected Double salario;
	
	protected Titulacao titulacao;
	
	public Funcionario(String nome, String email, Double salario, 
												Titulacao titulacao){
		super(nome, email);
		this.salario = salario;
		this.titulacao = titulacao;
	}
		
	public abstract Double retrubuicaoTitulacao();

}
