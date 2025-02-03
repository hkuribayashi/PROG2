package exemplos_20250203;

public class Universidade {

	public static void main(String[] args) {
		
		Discente d1 = new Discente("Hugo", 2382);
		Discente d2 = new Discente("Hugo2", 11111);
		
		Turma t1 = new Turma("Hugo", "XXXX");
		t1.adicionarDiscentesNaTurma(d1);
		t1.adicionarDiscentesNaTurma(d2);
		
		t1 = null;
		System.gc();
		
		System.out.println(t1);
		System.out.println(t1.getProfessor());
		System.out.println(d1);
		System.out.println(d2);
		
		
		
	}
}
