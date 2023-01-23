package atividade1;

public class Data {

	public Integer dia;
	public Integer mes;
	public Integer ano;
	
	public Data(Integer novoDia, 
				Integer novoMes,
				Integer novoAno) {
		this.dia = novoDia;
		this.mes = novoMes;
		this.ano = novoAno;
	}

	public String recuperaDadosParaImpressao() {
		return this.dia+"/"+
					 this.mes+
						"/"+this.ano;
	}
}
