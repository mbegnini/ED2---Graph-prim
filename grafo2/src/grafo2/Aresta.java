package grafo2;

public class Aresta {

	private Vertice v1;
	private Vertice v2;
	private int peso;
	
	
	public Aresta(Vertice v1, Vertice v2, int peso) {
		super();
		this.v1 = v1;
		this.v2 = v2;
		this.peso = peso;
		v1.addAresta(this);
		v2.addAresta(this);
	}


	public Vertice getV1() {
		return v1;
	}


	public void setV1(Vertice v1) {
		this.v1 = v1;
	}


	public Vertice getV2() {
		return v2;
	}


	public void setV2(Vertice v2) {
		this.v2 = v2;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Aresta [v1=" + v1.getId() + ", v2=" + v2.getId() + ", peso=" + peso + "]";
	}
	
	
	
	
}
