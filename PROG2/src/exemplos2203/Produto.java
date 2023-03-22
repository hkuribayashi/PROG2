package exemplos2203;

public class Produto {

	private Integer id;
	private String nome;
	private Double valor;
	private Categoria categoria;
	
	public Produto(Integer id, String nome, Double valor, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	
}
