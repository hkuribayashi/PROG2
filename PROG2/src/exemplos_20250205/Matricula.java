package exemplos_20250205;

public class Matricula {

	private Integer numero;
	
	private StatusMatricula status;
	
	private Curso curso;
	
	public Matricula(Integer numero, StatusMatricula status, 
											Curso curso) {
		this.numero = numero;
		this.status = status;
		this.curso = curso;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public StatusMatricula getStatus() {
		return status;
	}

	public void setStatus(StatusMatricula status) {
		this.status = status;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}		
