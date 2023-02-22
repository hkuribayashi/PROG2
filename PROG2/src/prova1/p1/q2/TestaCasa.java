package prova1.p1.q2;

public class TestaCasa {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Hugo");
		p1.setSobrenome("Kuribayashi");
		p1.setEmail("hugo@unifesspa.edu.br");
		
		Endereco e1 = new Endereco();
		e1.setRua("Rua dos Ipês");
		e1.setBairro("Cidade Jardim");
		e1.setCidade("Marabá");
		e1.setEstado("Pará");
		e1.setNumero(123);
		
		Casa c1 = new Casa();
		c1.setCor("Branca");
		c1.setEndereco(e1);
		c1.setProprietario(p1);
		c1.setValorVenda(100000.0);
		
		System.out.println("Dados da Casa");
		System.out.println("Proprietario: "+c1.getProprietario().getNome());
		System.out.println("Valor de Venda: "+c1.getValorVenda());
		System.out.println("Cor da Casa: "+c1.getCor());
		System.out.println("Endereço: ");
		System.out.println("Rua: "+c1.getEndereco().getRua());
		System.out.println("Numero: "+c1.getEndereco().getNumero());
		System.out.println("Bairro: "+c1.getEndereco().getBairro());
		System.out.println("Cidade: "+c1.getEndereco().getCidade());
		System.out.println("Estado: "+c1.getEndereco().getEstado());
	}
}
