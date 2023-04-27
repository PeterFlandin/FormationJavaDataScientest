package ex2p2;

public class Carre extends FormeGeometrique {

    public Carre(int x) {
        this.setX(x);
    }
    @Override
    public double getSuperficie() {
        return getX() + getX();
    }

    @Override
    public String toString() {
        return "Carre"+ getSuperficie();
    }
}