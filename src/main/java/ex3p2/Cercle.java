package ex3p2;

public class Cercle implements Mesurable{

    private double surfaceCercle;

    public Cercle(int surfaceCercle) {
        this.surfaceCercle = surfaceCercle;
    }

    public double getSurfaceCercle() {
        return surfaceCercle;
    }

    public void setSurfaceCercle(double surfaceCercle) {
        this.surfaceCercle = surfaceCercle;
    }



    @Override
    public double getMesure() {
        return surfaceCercle;
    }

}
