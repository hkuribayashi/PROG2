package atividade3;

public class TestaData {

	public static void main(String[] args) {
		
		Data d1 = new Data(30, 04, 2023);
	
		System.out.println(d1.getDia());
		
		d1.setDia(41);
		
		System.out.println(d1.getDia());
		
	}

}
