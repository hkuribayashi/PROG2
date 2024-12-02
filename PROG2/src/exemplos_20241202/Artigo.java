package exemplos_20241202;

public class Artigo {

	public Integer numero;
	
	public String titulo;
	
	public String descricao;
	
	public Discente autor;
	
	public Artigo(Integer numero, String titulo, 
			String descricao, Discente autor) {
		this.numero = numero;
		this.titulo = titulo;
		this.descricao = descricao;
		this.autor = autor;
	}
}
