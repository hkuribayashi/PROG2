package exemplos2003;

public abstract class Funcionario implements 
							Comparable<Funcionario>{

	public String nome;
	public Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public abstract Double calcularBonificacao();
	
	
	//hugo.compareTo(ana);
	@Override
	public int compareTo(Funcionario f) {
		if (this.salario > f.salario)
			return 1;
		else if (this.salario < f.salario)
			return -1;
		else return 0;
	}
}






