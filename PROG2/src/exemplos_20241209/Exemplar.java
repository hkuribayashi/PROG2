package exemplos_20241209;
public class Exemplar {

	private String codigo;
	private Livro livro;
	
	public Exemplar(String cod, Livro l) {
		this.codigo = cod;
		this.livro = l;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	
}
