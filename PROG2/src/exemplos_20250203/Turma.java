package exemplos_20250203;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	public List<Discente> discentes;
	public Professor responsavel;
	
	public Turma(String nomeProf, String areaAtuacao) {
		this.responsavel = new Professor(nomeProf, areaAtuacao);
		this.discentes = new ArrayList<Discente>();
	}
	
	public Professor getProfessor() {
		return this.responsavel;
	}
	
	public void adicionarDiscentesNaTurma(Discente d) {
		this.discentes.add(d);
	}
}
