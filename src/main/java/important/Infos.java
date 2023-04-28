package important;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

public class Infos {

        public static void main(String args[]) throws IOException {

            PrintStream pw = new PrintStream(new FileOutputStream("FileSortie.txt"));
            // redirection du output
            System.setOut(pw);
            System.out.println("Bonjour");

            InputStream stream = new FileInputStream("FileSortie.txt");
            System.setIn(stream);
            // Lecture du premier caractère
            char ch = (char) System.in.read();
            System.out.println("Output: " + ch);

            // Retourne les variables d'environnement du système.
            System.out.println(System.getenv());
            // Retourne la variable PROCESSOR LEVEL
            System.out.println(System.getenv("PROCESSOR_LEVEL"));
            // Retourne l'ensemble des propriétés du système.
            System.out.println(System.getProperties());
            // Retourne la propriété du java version.
            System.out.println(System.getProperty("java.specification.version"));

            // Autres méthodes // Retourne l'heure courante en millisecondes.
            System.out.println(System.currentTimeMillis());
            // Retourne l'heure actuelle,en nanosecondes.
            System.out.println(System.nanoTime());
            System.out.println("ramasse miette");
            // Lance l'exécution de la ramasse miettes
            System.gc();
            // Arrête l'exécution de la machine virtuelle Java avec l'état status.
            System.exit(0);

        }
    }

    /*
     * String accumulator = ""; do { char alter = (char) System.in.read();
     * accumulator += alter; } while (System.in.available() > 0);
     * System.out.println("Du bist " + accumulator.trim() + " Jahre alt.");
     */
//}

