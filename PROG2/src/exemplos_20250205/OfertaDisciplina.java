package exemplos_20250205;

import java.util.ArrayList;
import java.util.List;

public class OfertaDisciplina {

	private String nome;
	
	private String periodo;
	
	private Disciplina disciplina;
	
	private Docente docente;
	
	private List<Discente> discentes;
	
	public OfertaDisciplina(String nome, String periodo, 
			Disciplina disciplina, Docente docente) {
		this.nome = nome;
		this.periodo = periodo;
		this.disciplina = disciplina;
		this.docente = docente;
		this.discentes = new ArrayList<Discente>();
	}
	
	public OfertaDisciplina(String nome, String periodo, 
				Disciplina disciplina, Docente docente, 
								List<Discente> discentes) {
		this.nome = nome;
		this.periodo = periodo;
		this.disciplina = disciplina;
		this.docente = docente;
		this.discentes = discentes;
	}
}






