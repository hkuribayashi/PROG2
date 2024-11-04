package exemplos_20241104;

public class TestadorDeGatos {

	public static void main(String[] args) {
		
		Gato g1 = new Gato("Sushi", 3, true);
		
		g1.miar();
		g1.comer();
		g1.dormir();
		
		System.out.println("Nome: " + g1.nome);
		System.out.println("Comida: " + g1.qtdComidaDisponivel);
		System.out.println("Sono: " + g1.sono);
		
		
		
		Gato g2 = new Gato("Cachaça", 1, true);
		
		System.out.println("Nome: "+g2.nome);
		System.out.println("Comida: "+g2.qtdComidaDisponivel);
		System.out.println("Sono: "+g2.sono);
		
	}
}
