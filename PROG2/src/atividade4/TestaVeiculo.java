package atividade4;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Veiculo v1 = new Veiculo();
		v1.marca = "Tesla";
		v1.modelo = "XXA11";
		v1.velocidade = 0.0;
		
		v1.acelerar();
		System.out.println( v1.velocidade );
		
		Carro gol = new Carro();
		gol.marca = "Volks";
		gol.modelo = "V1192";
		gol.velocidade = 0.0;
		gol.placa = "a0qi20";
		gol.acelerar();
		gol.desligar();
		System.out.println(gol.velocidade);
		System.out.println(gol.ligado);
		
		Bicicleta b1 = new Bicicleta();
		b1.marca = "Caloi";
		b1.modelo = "au118u2";
		b1.velocidade = 0.0;
		b1.setTamanhoAro(29);
		b1.setTamanhoQuadro(19);
		b1.acelerar();
		b1.acelerar();
		b1.acelerar();
		System.out.println(b1.velocidade);
		
		
		
	}
}
