package important.fileoutpout;


import java.io.OutputStream;

public class OutPutStreamTest {
    public static void main(String args[]) {
        String s = "Hello, world";

        // convertit String en un tableau d'octets
        byte[] data = s.getBytes();

        OutputStream output = null;
        try {
            output = System.out;
            output.write(data);
            output.close();
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }
    }
}