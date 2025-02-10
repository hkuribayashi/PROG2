package exemplos_20250205;

import java.util.HashMap;
import java.util.Map;

public class Faculdade {

	private String nome;
	
	private String sigla;
	
	private Map<String, Curso> cursos;
	
	public Faculdade(String nome, String sigla) {
		this.nome = nome;
		this.sigla = sigla;
		this.cursos = new HashMap<String, Curso>();
	}
	
	public void adicionarCurso(String nome, Double duracao, 
											Tecnico secretario) {
		this.cursos.put(nome, new Curso(nome, duracao, secretario));
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public Map<String, Curso> getCursos() {
		return cursos;
	}

	public void setCursos(Map<String, Curso> cursos) {
		this.cursos = cursos;
	}

}
