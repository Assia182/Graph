package graph;

import graph.Vertex;

public class DirectedEdge extends Edge {
    private int source;


    public DirectedEdge(int id, String color, Vertex Vsource, Vertex Vsink, double value) {
        super(id, color, new Vertex[]{Vsource, Vsink}, value);
        this.source = Vsource.getId();
    }

    public Vertex getSource() {
        Vertex[] e=getEnds();
        if (e[0].getId()==source){
            return e[0];
        }else {
            return e[1];
        }
    }
    public Vertex getSink(){
        Vertex[] e=getEnds();
        if (e[0].getId()==source){
            return e[1];
        }else {
            return e[0];
        }
    }

    @Override
    public String toString() {
        return getSource()+"-->"+getSink();
    }
}