package exemplos_20250129;

public class TestaComposicao {

	public static void main(String[] args) {
		
		Universidade x = new Universidade("Universidade ACME");
		
		x.adicionaDepartamento("Recursos Humanos");
		
		// "Apagando" a universidade x
		x = null;
		System.gc();
		
		System.out.println( x.departamentos.get(0) );
		
		
		
	}
}
