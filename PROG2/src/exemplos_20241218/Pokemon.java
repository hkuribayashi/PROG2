package exemplos_20241218;

import java.util.List;
import java.util.ArrayList;

public class Pokemon{

	protected Integer idPokedex;
	protected String nome;
	protected Double peso;
	protected Double altura;
	protected Double hp;
	protected List<Ataque> ataques;
	protected List<Fraqueza> fraquezas;
	
	public Pokemon(Integer idPokedex, String nome, Double peso, Double altura) {
		this.idPokedex = idPokedex;
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.hp = 100.0;
		this.ataques = new ArrayList<Ataque>();
		this.fraquezas = new ArrayList<Fraqueza>();
	}
	
	public void atacar(Ataque a, Pokemon outroPokemon) {
		outroPokemon.hp -= a.getPoder()*a.getPrecisao();
	}

	public Integer getIdPokedex() {
		return idPokedex;
	}

	public void setIdPokedex(Integer idPokedex) {
		this.idPokedex = idPokedex;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Pokemon [idPokedex=" + idPokedex + ", nome=" + nome + ", peso=" + peso + ", altura=" + altura + "]";
	}
	
	
	
	
	
}
