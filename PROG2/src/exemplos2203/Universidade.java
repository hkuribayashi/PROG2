package exemplos2203;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

	private String nome;
	private String sigla;
	private List<Departamento> departamentos;
	
	public Universidade(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
		this.departamentos = new ArrayList<>();
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

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}
}
