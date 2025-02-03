package exemplos_20250103;

public abstract class Item {

	private String titulo;
	private Double valor;
	private Autor autor;
	
	public Item(String t, Double v, Autor a) {
		this.titulo = t;
		this.valor = v;
		this.autor = a;
	}

	public String getTitulo() {
		return titulo;
	}

	public Double getValor() {
		return valor;
	}

	public Autor getAutor() {
		return autor;
	}

	@Override
	public String toString() {
		return "Item [titulo=" + titulo + ", valor=" + valor 
									+ ", autor=" + autor + "]";
	}
}