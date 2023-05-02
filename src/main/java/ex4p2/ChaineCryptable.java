package ex4p2;

public class ChaineCryptable extends Chaine implements Cryptable{

    protected boolean visibilité;

    public ChaineCryptable(String n, float f, char p) {
        super(n, f, p);
    }
    public boolean getVisibilité() {
        return visibilité;
    }

    @Override
    public void crypter() {

    }

    @Override
    public void décrypter() {
    }
}
