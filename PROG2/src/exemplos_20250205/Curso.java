package exemplos_20250205;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	
	private Double duracaoTotal;
	
	private Tecnico secretario;
	
	private List<Matricula> matriculas;
	
	public Curso(String nome, Double duracaoTotal, 
											Tecnico secretario) {
		this.nome = nome;
		this.duracaoTotal = duracaoTotal;
		this.secretario = secretario;
		this.matriculas = new ArrayList<Matricula>();
	}
	
	public void adicionarMatricula(Discente discente) {
		this.matriculas.add( discente.getMatricula() );
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getDuracaoTotal() {
		return duracaoTotal;
	}

	public void setDuracaoTotal(Double duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}

	public Tecnico getSecretario() {
		return secretario;
	}

	public void setSecretario(Tecnico secretario) {
		this.secretario = secretario;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}
}




