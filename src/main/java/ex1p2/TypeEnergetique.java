package ex1p2;

public enum TypeEnergetique  {


    Econome("econome"), Modéré("modere"), Energivore("energivore");

    private String typeE;

    TypeEnergetique(String typeE) {
        this.typeE = typeE;
    }

    public String getTypeE() {
        return typeE;
    }

    public void setTypeE(String typeE) {
        this.typeE = typeE;
    }

}
