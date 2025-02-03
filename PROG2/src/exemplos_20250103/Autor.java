package exemplos_20250103;

public class Autor {

	private String nome;
	
	private String email;
	
	public Autor(String n, String e) {
		this.nome = n;
		this.email = e;
	}

	@Override
	public String toString() {
		return "Autor [nome=" + nome + ", email=" + email + "]";
	}
}
