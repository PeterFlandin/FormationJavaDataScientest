package ex2p2;

public abstract class FormeGeometrique {

    private int x;

    public FormeGeometrique() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public abstract double getSuperficie();

}