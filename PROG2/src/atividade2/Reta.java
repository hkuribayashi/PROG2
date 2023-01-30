package atividade2;

public class Reta {

	// y = ax + b
	// a = ang
	// b = lin
	public Double ang;
	public Double lin;
	
	public Reta(Double a, Double b) {
		this.ang = a;
		this.lin = b;
	}
	
	public Reta (Ponto p1, Ponto p2) {
		this.ang = (p2.y - p1.y)/(p2.x - p1.x);
		this.lin = p1.y - (this.ang * p1.x);
	}
	
	public String getRepresentacao() {
		// y = ax + b
		return "y = "+this.ang+"x + "+this.lin;
	}
	
	public Boolean pertenceReta(Ponto p) {
		return (p.y == p.x * this.ang + this.lin);
	}
	
	// x = (b2 - b1)/(a1 - a2)
	public Ponto getIntersecao(Reta outraReta) {
		Ponto p = new Ponto();
		
		p.x = (outraReta.lin - this.lin)/
							(this.ang - outraReta.ang);
		
		p.y = this.ang * p.x + this.lin;
		
		if (p.x.isInfinite())
			return null;
		else return p;
	}
	
	
}
