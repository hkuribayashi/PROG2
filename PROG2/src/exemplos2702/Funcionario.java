package exemplos2702;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected Double salario;
	private Double cargaHoraria;
	
	public Double calculaBonificacao() {
		return this.salario * 0.1;
	}

	public Double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(Double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

}
