package exemplos1502;

public class Conta {

	private static Integer contador = 0;
	private String nomeTitular;
	
	public Conta() {
		Conta.contador += 1;
	}
	
	public static Integer getContador() {
		return Conta.contador;
	}
}
