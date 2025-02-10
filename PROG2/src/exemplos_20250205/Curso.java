package exemplos_20250205;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Curso {

	private String nome;
	
	private Double duracaoTotal;
	
	private Tecnico secretario;
	
	private List<Matricula> matriculas;
	
	private Map<String, Disciplina> disciplinas;
	
	public Curso(String nome, Double duracaoTotal, 
											Tecnico secretario) {
		this.nome = nome;
		this.duracaoTotal = duracaoTotal;
		this.secretario = secretario;
		this.matriculas = new ArrayList<Matricula>();
		this.disciplinas = new HashMap<String, Disciplina>();
	}
	
	public void adicionarMatricula(Discente discente) {
		this.matriculas.add( discente.getMatricula() );
	}
	
	public void adicionarDisciplinas(String codigo, String nome, 
												Double cargaHoraria) {
		Disciplina d1 = new Disciplina(nome, cargaHoraria);
		this.disciplinas.put(codigo, d1);
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




