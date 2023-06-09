package important;


import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileInfoExample {
    public static void main(String[] args) throws IOException {
// Créer un fichier en spécifiant son chemin
        File apath = new File("C:/file.txt");
        apath.createNewFile();
        System.out.println("Path exists? " + apath.exists());
        if (apath.exists()) {
            // Vérifiez si 'apath' est un dossier ou non?
            System.out.println("Directory? " + apath.isDirectory());
            // Vérifiez si 'apath' est un chemin caché?
            System.out.println("Hidden? " + apath.isHidden());
            // Le nom simple.
            System.out.println("Simple Name: " + apath.getName());

            // Le chemin absolu.
            System.out.println("Absolute Path: " + apath.getAbsolutePath());

            // Vérifiez la taille du fichier (en octets):
            System.out.println("Length (bytes): " + apath.length());

            // Dernière modification (en milli seconde)
            long lastMofifyInMillis = apath.lastModified();
            Date lastModifyDate = new Date(lastMofifyInMillis);

            System.out.println("Last modify date: " + lastModifyDate);

        }

    }

}
