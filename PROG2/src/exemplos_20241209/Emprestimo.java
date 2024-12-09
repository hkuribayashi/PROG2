package exemplos_20241209;

import java.util.Date;
import java.util.List;

public class Emprestimo {

	private Date dataEmprestimo;
	
	private Date dataDevolucao;
	
	private Usuario usuario;
	
	private List<Exemplar> exemplares;
	
	public Emprestimo(Date dataEmprestimo, Usuario usuario, 
			List<Exemplar> exemplares) {
		this.dataEmprestimo = dataEmprestimo; 
		this.dataDevolucao = null;
		this.usuario = usuario;
		this.exemplares = exemplares;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
}
