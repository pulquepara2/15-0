import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Passwort {
    public static void main(String[] args) {
        String passwort = "geheim";
        Scanner scanner = new Scanner(System.in);
        String wort;
        // wie alt ist das pw?
        // wenn pw älter als 5, soll es geändert werden
        int pwalter = 3;
        if (pwalter >= 5){
            System.out.println("Bitte PW aendern: ");
            passwort = scanner.next();
        }

        do {
            System.out.println("Bitte geben ihr Passwort ein: ");
            wort = scanner.next();
        } while (!wort.equals(passwort));
        System.out.println("Passwort korrekt");
    }
}
