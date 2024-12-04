package exemplos_20241204;

public class TestadorCarros {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Compass");
		System.out.println( c1.getModelo() );
		System.out.println( Carro.getContador() );
		
		for (int i=0; i<1000; i++) {
			new Carro("Kicks");	
		}
		
		System.out.println( Carro.getContador() );

	}

}
