package exemplos_20241209;

import java.util.Date;

public class Emprestimo {

	private Date dataEmprestimo;
	
	private Date dataDevolucao;
	
	private Usuario usuario;
	
	public Emprestimo(Date dataEmprestimo, Usuario usuario) {
		this.dataEmprestimo = dataEmprestimo; 
		this.dataDevolucao = null;
		this.usuario = usuario;
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
