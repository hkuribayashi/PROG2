package prova1.p2.q2;

public class TestaCarro {

	public static void main(String[] args) {
		
		Motor m1 = new Motor();
		m1.setFabricante("Honda");
		m1.setPotencia(1.3);
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Hugo");
		p1.setSobrenome("Kuribayashi");
		p1.setEmail("hugo@unifesspa.edu.br");
		
		Carro c1 = new Carro();
		c1.setAnoFabricacao(2021);
		c1.setMotor(m1);
		c1.setProprietario(p1);
		
		System.out.println("Dados do Carro");
		System.out.println("Ano de Fabricacao: "+c1.getAnoFabricacao());
		System.out.println("Motor:");
		System.out.println("Fabricante: "+m1.getFabricante());
		System.out.println("Potencia: "+m1.getPotencia());
		System.out.println("Proprietário:");
		System.out.println("Nome: "+c1.getProprietario().getNome());
		System.out.println("Sobrenome: "+c1.getProprietario().getSobrenome());
		System.out.println("Email: "+c1.getProprietario().getEmail());
	}
}
