package grafo2;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static Grafo g;
	static List<Aresta> arvoreMinima;
	
	public static void main(String args[]) {
		g = new Grafo();
		
		
		for(int i=0; i<8; i++) {
			g.addVertice(new Vertice(i));
		}
		
		g.addAresta(new Aresta(g.getVertice(0), g.getVertice(1), 3));
		g.addAresta(new Aresta(g.getVertice(0), g.getVertice(6), 9));
		g.addAresta(new Aresta(g.getVertice(1), g.getVertice(2), 7));
		g.addAresta(new Aresta(g.getVertice(1), g.getVertice(5), 15));
		g.addAresta(new Aresta(g.getVertice(2), g.getVertice(3), 2));
		g.addAresta(new Aresta(g.getVertice(2), g.getVertice(7), 12));
		g.addAresta(new Aresta(g.getVertice(3), g.getVertice(4), 3));
		g.addAresta(new Aresta(g.getVertice(4), g.getVertice(5), 4));
		g.addAresta(new Aresta(g.getVertice(4), g.getVertice(6), 6));
		g.addAresta(new Aresta(g.getVertice(6), g.getVertice(7), 3));

		
		System.out.println(g);

		arvoreMinima = prim(g.getVertice(1));
		System.out.println();
		System.out.println();
		System.out.println(arvoreMinima);
		
	}
	
	public static List<Aresta> prim(Vertice vertice){
		List<Aresta> am = new ArrayList<Aresta>();
		List<Vertice> visitados = new ArrayList<Vertice>();
		
		visitados.add(vertice);
		
		while(visitados.size() < g.getNumberOfVertices()) {
			Aresta menorPeso = null;
			for(Vertice v: visitados) {
				for (Aresta a : v.getArestas()) {
					if(a.getV1()!=v) {
						if(!visitados.contains(a.getV1())) {
							if(menorPeso == null) {
								menorPeso = a;
							}else {
								if (a.getPeso() < menorPeso.getPeso()) {
									menorPeso = a;
								}
							}
						}
					}else {
						if(!visitados.contains(a.getV2())) {
							if(menorPeso == null) {
								menorPeso = a;
							}else {
								if (a.getPeso() < menorPeso.getPeso()) {
									menorPeso = a;
								}
							}
						}
					}
				}
			}
			if(visitados.contains(menorPeso.getV1()))
				visitados.add(menorPeso.getV2());
			else
				visitados.add(menorPeso.getV1());
			am.add(menorPeso);
		}
		
		
		return am;
	}

}
























