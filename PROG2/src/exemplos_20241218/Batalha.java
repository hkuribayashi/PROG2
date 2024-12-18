package exemplos_20241218;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Batalha {
	
	public static void lutar(List<Pokemon> lista) {
		// Escolher o primeiro Pokemon
		
		Random random = new Random();
		
		int primeiroPokemon = random.nextInt(lista.size());
		
		int segundoPokemon; 
		do {
			segundoPokemon = random.nextInt(lista.size());
		}while(primeiroPokemon == segundoPokemon);
		
		Pokemon p1 = lista.get(primeiroPokemon);
		Pokemon p2 = lista.get(segundoPokemon);
		
		p1.atacar(p1.ataques.get(0), p2);
		
		
	}

	public static void main(String[] args) {
		Ataque a1 = new Ataque(1, "Choque do Trovão");
		Fraqueza f1 = new Fraqueza(22, "Ataques de Terra");
		PokemonEletrico p1 = new PokemonEletrico(222,
												"Pikachu",
												2.0,
												1.0);
		PokemonEletrico p2 = new PokemonEletrico(223,
												"Raichu",
												2.3,
												1.2);
		PokemonFogo p3 = new PokemonFogo(11,
										"Charizard",
										22.0,
										4.0);
		Ataque a3 = new Ataque(22, "Bola de Fogo");
		
		p1.ataques.add(a1);
		p2.ataques.add(a1);
		p1.fraquezas.add(f1);
		p2.fraquezas.add(f1);
		p3.ataques.add(a3);
		
		List<Pokemon> lista = new ArrayList<Pokemon>(); 
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		Batalha.lutar(lista);
	}
}
