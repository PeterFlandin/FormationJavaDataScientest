package ex6p2;

public class Triple <T>{


    private T t;
    private T t2;
    private T t3;

    public Triple(T t, T t2, T t3) {
        this.t = t;
        this.t2 = t2;
        this.t3 = t3;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    public T getT3() {
        return t3;
    }

    public void setT3(T t3) {
        this.t3 = t3;
    }

    public void getPremiere(T t) {

    }

    public void getSecond(T t2) {

    }

    public void getTroisieme(T t3) {

    }

    @Override
    public String toString() {
        return "resultat : " + t + " " + t2 + " " + t3 ;
    }
}
