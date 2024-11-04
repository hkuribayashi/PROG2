package exemplos_20241104;

public class Gato {

	public String nome;
	
	public Integer qtdComidaDisponivel;
	
	public Boolean sono;
	
	public Gato(String nome, Integer comida, 
			    Boolean sono){
		this.nome = nome;
		this.qtdComidaDisponivel = comida;
		this.sono = sono;
	}
	
	public void miar() {
		System.out.println("Miau!!");
	}
	
	public int comer() {
		this.qtdComidaDisponivel 
				-= this.qtdComidaDisponivel;
		return this.qtdComidaDisponivel;
	}
	
	public void dormir() {
		this.sono = false;
	}
	
	
}
