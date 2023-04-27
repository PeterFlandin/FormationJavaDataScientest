package ex2p2;

public class Cercle extends FormeGeometrique {

    public Cercle(int x) {
        this.setX(x);
    }
    public double getSuperficie() {
        return 2 * Math.PI * getX();
    }

    @Override
    public String toString() {
        return "cercle" + getSuperficie();
    }
}