package graph;

import graph.Vertex;

public class MyTest {

    public static void main(String[] args) {
        Vertex v1=new Vertex(1,null,"red");
        Vertex v2=new Vertex(2,null,"blue");
        Edge dirE=new DirectedEdge(1,"red",v1,v2,8);
        System.out.println(dirE);

    }
}
