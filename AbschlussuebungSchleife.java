import java.nio.file.Paths;
import java.util.Scanner;

public class AbschlussuebungSchleife {
    public static void main(String[] args) throws Exception {
        //Nur den Pfad der txt Datei in die Variable speichern
        String file = "C:\\Users\\s53033\\Downloads\\faust.txt";

        // Mittels Scanner und der Option "Paths.get(PFAD") den Inhalt der dort befindlichen Datei auslesen
        Scanner buchText = new Scanner(Paths.get(file));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie bitte das Wort ein, welches gezählt werden soll (Groß/Kleinschreibung ist egal):");
        String wort = scanner.next();


        int wordcount = 0;
        while (buchText.hasNext()){
            String aktuellesWort = buchText.next();
            if (aktuellesWort.toLowerCase().equals(wort)) {
                wordcount = wordcount + 1;
            }
        }
        System.out.println("Das Wort " + wort + " kommt " + wordcount + " mal vor.");

    }

}
