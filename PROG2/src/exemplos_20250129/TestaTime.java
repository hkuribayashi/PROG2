package exemplos_20250129;

public class TestaTime {

	public static void main(String[] args) {

		Time t = new Time("Águia de Marabá");
		
		Atleta a1 = new Atleta("Bruno Limão", 40, "Meia");
		
		t.atletas.add(a1);
		
		// "Apagando" a variavel t
		t = null;
		System.gc();
		
		System.out.println(a1);
	}

}
