package important.fileoutpout.buffer;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestOutputstream {
    public static void main(String args[]) {
        Path chemin = Paths.get("E:\\intro.txt");
        String s = "Hello, world";
        // convertit String en un tableau d'octets
        byte[] data = s.getBytes();

        OutputStream output = null;
        try {
            // Un objet BufferedOutputStream est affecté à la référence OutputStream.
            output = new BufferedOutputStream(Files.newOutputStream(chemin));
            // Ecrire dans le fichier
            output.write(data);
            // vider le tampon
            output.flush();
            // fermer le fichier
            output.close();

        } catch (Exception e) {
            System.out.println("Message " + e);
        }
    }
}