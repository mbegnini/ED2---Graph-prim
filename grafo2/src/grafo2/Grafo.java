package grafo2;

import java.util.ArrayList;
import java.util.List;

public class Grafo {
	
	private List<Aresta> arestas;
	private List<Vertice> vertices;
	
	public Grafo() {
		arestas = new ArrayList<Aresta>();
		vertices = new ArrayList<Vertice>();
	}

	public void addVertice(Vertice vertice) {
		vertices.add(vertice);
	}
	
	public int getNumberOfVertices() {
		return vertices.size();
	}
	
	public void addAresta(Aresta aresta) {
		arestas.add(aresta);
	}
	
	public Vertice getVertice(int pos) {
		return vertices.get(pos);
	}
	
	@Override
	public String toString() {
		return "Grafo [vertices=\n" + vertices + ", \narestas=" + arestas + "]";
	}
	
}
