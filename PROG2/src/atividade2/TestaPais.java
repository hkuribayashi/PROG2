package atividade2;

public class TestaPais {

	public static void main(String[] args) {
		Pais p1 = new Pais("BRA", "Brasil", 
				            210000000, 8732873.0);
		
		p1.vizinhos.add("Argentinha");// 0
		p1.vizinhos.add("Uruguai"); //1
		p1.vizinhos.add("Paraguai"); //2
		
		System.out.println( p1.vizinhos.size() );
		
		Pais p2 = new Pais("EUA", "Estados Unidos", 
								29382938, 2989238.0);
		
		System.out.println( p1.verificaPais(p2) );
		
		System.out.println( p1.comparaPais(p2) );
		
		System.out.println( p1.getDensidadePopulacional());
		

	}

}
