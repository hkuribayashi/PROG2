package exemplos_20241218;

public class Ataque {

	private Integer idAtaque;
	
	private String nome;
	
	private Double precisao;
	
	private Double poder;
	
	public Ataque(Integer idAtaque, String nome) {
		this.idAtaque = idAtaque;
		this.nome = nome;
		this.precisao = 0.1;
		this.poder = 100.0;
	}
	
	

	public Integer getIdAtaque() {
		return idAtaque;
	}



	public void setIdAtaque(Integer idAtaque) {
		this.idAtaque = idAtaque;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Double getPrecisao() {
		return precisao;
	}



	public void setPrecisao(Double precisao) {
		this.precisao = precisao;
	}



	public Double getPoder() {
		return poder;
	}



	public void setPoder(Double poder) {
		this.poder = poder;
	}



	@Override
	public String toString() {
		return "Ataque [idAtaque=" + idAtaque + ", nome=" + nome + "]";
	}
}
