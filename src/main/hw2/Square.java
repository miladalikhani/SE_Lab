package main.hw2;

public class Square implements Shape{

    int edge;

    public Square(int edge)
    {
        this.edge = edge;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }

    public int getEdge() {
        return edge;
    }

    @Override
    public int computeArea() {
        return (int) Math.pow(edge,2);
    }
}

