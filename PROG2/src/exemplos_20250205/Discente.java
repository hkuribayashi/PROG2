package exemplos_20250205;

public class Discente extends Pessoa{

	private Matricula matricula;
	
	private Double crg;
	
	public Discente(String nome, String email, 
					Matricula matricula, Double crg) {
		super(nome, email);
		this.matricula = matricula;
		this.crg = crg;
	}

	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public Double getCrg() {
		return crg;
	}

	public void setCrg(Double crg) {
		this.crg = crg;
	}
}
