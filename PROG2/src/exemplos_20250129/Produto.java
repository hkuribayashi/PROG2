package exemplos_20250129;

public class Produto {

	private Integer id;
	private String nomeProduto;
	private Double valor;
	private Categoria categoria;
	
	public Produto(Integer i, String n, Double v, Categoria c) {
		this.id = i;
		this.nomeProduto = n;
		this.valor = v;
		this.categoria = c;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nomeProduto=" + nomeProduto + ", valor=" + valor + ", categoria=" + categoria
				+ "]";
	}
	
	
}
