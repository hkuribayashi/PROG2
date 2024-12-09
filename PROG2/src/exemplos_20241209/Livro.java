package exemplos_20241209;

import java.util.List;

public class Livro {

	private String titulo;
	
	private Integer ano;
	
	private Genero generoLivro;
	
	private List<String> autores;
	
	public Livro(String titulo, Integer ano, Genero generoLi,
			List<String> autores) {
		this.titulo = titulo;
		this.ano = ano;
		this.generoLivro = generoLi;
		this.autores = autores;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public Genero getGeneroLivro() {
		return generoLivro;
	}

	public void setGeneroLivro(Genero generoLivro) {
		this.generoLivro = generoLivro;
	}

	public List<String> getAutores() {
		return autores;
	}

	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	
	
}

