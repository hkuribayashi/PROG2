package exemplos_20250129;

import java.util.ArrayList;
import java.util.List;

public class Categoria {

	private Integer id;
	private String nomeCategoria;
	private List<Produto> produtos;
	
	
	public Categoria(Integer id, String nome) {
		this.id = id;
		this.nomeCategoria = nome;
		this.produtos = new ArrayList<Produto>();
	}

	@Override
	public String toString() {
		return "Categoria [id=" + id + ", nomeCategoria=" + nomeCategoria + "]";
	}



	public List<Produto> getProdutos() {
		return produtos;
	}
}
