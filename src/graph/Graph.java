package graph;

import graph.Edge;
import graph.Vertex;

public interface Graph {

    enum EdgeKind{
        DIRECTED,
        UNDIRECTED
    }


    int nbOfVertices();

    int nbOfEdges();

    void addVertex(Vertex v);


    void addEdge(Vertex v1, Vertex v2,EdgeKind kind);


    boolean isConnected(Vertex v1, Vertex v2);


    boolean isConnected();


    Edge[] getEdges(Vertex v1, Vertex v2);


    Edge[] getEdges();


    Vertex[] getVertices();


    Edge[] getNeighborEdges(Vertex v);
}