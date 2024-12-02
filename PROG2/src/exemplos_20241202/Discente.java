package exemplos_20241202;

public class Discente {
	
	public Integer matricula;
	
	public String nome;
	
	public Integer semestre;
	
	public Double crg;
	
	public Professor orientador;
	
	public Discente(Integer matricula, String nome, 
			Professor orientador) {
		this.matricula = matricula;
		this.nome = nome;
		this.semestre = 1;
		this.crg = 0.0;
		this.orientador = orientador; 
	}
	
	public Discente(Integer matricula, String nome, 
		Integer semestre, Double crg, Professor orientador) {
		this.matricula = matricula;
		this.nome = nome;
		this.semestre = semestre;
		this.crg = crg;
		this.orientador = orientador; 
	}
	
	
}
