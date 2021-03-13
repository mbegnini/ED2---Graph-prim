package grafo2;

import java.util.ArrayList;
import java.util.List;

public class Vertice {
	
	private int id;
	private List<Aresta> arestas;
	
	public Vertice(int id) {
		this.id = id;
		arestas = new ArrayList<Aresta>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void addAresta(Aresta aresta) {
		arestas.add(aresta);
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}
	
	@Override
	public String toString() {
		return "Vertice [id=" + id + ", arestas=" + arestas + "]\n";
	}
	


}
