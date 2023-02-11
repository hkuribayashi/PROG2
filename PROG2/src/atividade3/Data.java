package atividade3;

public class Data {

	private Integer dia;
	private Integer mes;
	private Integer ano;

	public Data(Integer d, Integer m, Integer a) {
		this.valData(d, m, a);
		this.dia = d;
		this.mes = m;
		this.ano = a;
	}
	
	public Integer getDia() {
		return this.dia;
	}
	
	public Integer getMes() {
		return this.mes;
	}
	
	public Integer getAno() {
		return this.ano;
	}
	
	public void setDia(Integer d) {
		this.dia = d;
	}
	
	public void setMes(Integer m) {
		this.mes = m;
	}
	
	public void setAno(Integer a) {
		this.ano = a;
	}

	private void valData(Integer d, Integer m, Integer a) {
		if (a >= 2023){
			if (m >= 1 && m <= 12) {
				if (m == 4 || m == 6 || m == 9 || m == 11) {
					if (!(d >= 1 && d <= 30))// Meses de 30 dias
						throw new RuntimeException("Mes "+m+
								" deve ter 30"
								+ "dias");
				}else if (m == 2) { // Fevereiro
					if (!(d >= 1 && (d <=28 || d<=29)))
						throw new RuntimeException("Fevereiro "
								+ "deve ter entre 1 e 28/29 dias");
				}else { // Meses de 31 dias
					if (!(d >= 1 && d <= 31))
						throw new RuntimeException("Mes "+m+
								" deve ter 31 dias");
				}
			} else throw new RuntimeException("Mes Inválido");

		}else throw new RuntimeException("Ano inválido");
	}







}
