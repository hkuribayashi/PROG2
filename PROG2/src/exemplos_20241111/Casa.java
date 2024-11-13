package exemplos_20241111;

public class Casa {

	public Pessoa proprietario;
	
	public Cor corCasa;
	
	public Porta porta1;
	
	public Porta porta2;
	
	public Porta porta3;
	
	public Casa(Pessoa proprietarioCasa) {
		this.proprietario = proprietarioCasa;
		this.corCasa = Cor.BRANCA;
		this.porta1 = new Porta(0.7, 2.0, 0.1);
		this.porta2 = new Porta(0.7, 2.0, 0.1);
		this.porta3 = new Porta(0.7, 2.0, 0.1);
	}
	
	public Casa(Pessoa proprietarioCasa, Cor corDaCasa) {
		this.proprietario = proprietarioCasa;
		this.corCasa = corDaCasa;
		this.porta1 = new Porta(0.7, 2.0, 0.1);
		this.porta2 = new Porta(0.7, 2.0, 0.1);
		this.porta3 = new Porta(0.7, 2.0, 0.1);
	}
	
	public void pintarCasa(Cor novaCorDaCasa) {
		this.corCasa = novaCorDaCasa;
		this.porta1.pintar(novaCorDaCasa);
		this.porta2.pintar(novaCorDaCasa);
		this.porta3.pintar(novaCorDaCasa);
	}
	
	public Integer qtdPortasEstaoAbertas() {
		Integer contador = 0;
		if (this.porta1.aberta)
			contador++;
		if (this.porta2.aberta)
			contador++;
		if (this.porta3.aberta)
			contador++;
		return contador;
	}
	
	public void alterarPropritario(Pessoa novoProprietario) {
		this.proprietario = novoProprietario;
	}
	
	public String toString() {
		return "Casa:[proprietario="+this.proprietario
				+ ", corDaCasa="+this.corCasa
				+ ", porta1="+this.porta1
				+ ", porta2="+this.porta2
				+ ", porta3="+this.porta3+"]";
	}

}




