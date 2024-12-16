package exemplos_20241209;

import java.util.List;
import java.util.ArrayList;

public class Usuario {

	private Integer cpf;
	
	private String nome;
	
	private List<Emprestimo> historicoEmprestimos;
	
	public Usuario(Integer cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
		this.historicoEmprestimos = new ArrayList<Emprestimo>();
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Emprestimo> getHistoricoEmprestimos() {
		return historicoEmprestimos;
	}

	public void setHistoricoEmprestimos(List<Emprestimo> historicoEmprestimos) {
		this.historicoEmprestimos = historicoEmprestimos;
	}
	
	public String toString() {
		return "Usuario[nome="+this.nome+", "+
						"cpf="+this.cpf+", "+
						"emprestimos=["+this.historicoEmprestimos+"] ]";
	}
	
}
