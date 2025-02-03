package exemplos_20250103;

public class Livro extends ItemImpresso{

	private Integer numeroPaginas;
	private String tipoLivro;
	private Editora editora;
	
	public Livro(String titulo, Double valor, Autor autor, 
		  Integer numeroPaginas, String tipoLivro, Editora editora) {
		super(titulo, valor, autor);
		this.numeroPaginas = numeroPaginas;
		this.tipoLivro = tipoLivro;
		this.editora = editora;
	}

	@Override
	public Double calcularTempoEmprestimo() {
		if (this.tipoLivro.equals("Consulta"))
			return 8.0;
		else return 56.0;
	}
}
