package exemplos_20250129;

import java.util.ArrayList;
import java.util.List;

public class Universidade {

	private String nomeUniversidade;
	
	public List<Departamento> departamentos;
	
	public Universidade(String nome) {
		this.nomeUniversidade = nome;
		this.departamentos = new ArrayList<Departamento>();
	}
	
	// Método que adiciona um novo departamento
	public void adicionaDepartamento(String nome) {
		this.departamentos.add( new Departamento(nome) );
	}

	@Override
	public String toString() {
		return "Universidade [nomeUniversidade=" + nomeUniversidade + ", departamentos=" + departamentos + "]";
	}
}