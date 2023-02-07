package exercicios3101;

public class TestaCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println(c1.cor);
		System.out.println(c1.modelo);
		System.out.println(c1.velocidadeAtual);
		System.out.println(c1.velocidadeMaxima);
		System.out.println(c1.motor);
		
		//Motor novoMotor = new Motor();
		//Carro c2 = new Carro("Cinza", "HRV", novoMotor);
		
		Carro c2 = new Carro("Cinza", "HRV", new Motor(2500.0, "16V"));
		
		/*
		Motor m1 = new Motor(2000.0, "8V");
		System.out.println(m1.tipo);
		System.out.println(m1.potencia);
		System.out.println(m1.taLigado);
		
		Motor m2 = new Motor();
		System.out.println(m2.tipo);
		System.out.println(m2.potencia);
		System.out.println(m2.taLigado);
		*/
	}
}
