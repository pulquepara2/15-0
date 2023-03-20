import java.util.Scanner;

public class Hund {
    String name;
    int alter;
    String rasse;
    String farbe;


    public void bellen(){
        System.out.println("wuff wuff");
    }
    public void gibInfos(){
        System.out.println("Der Hund heißt " + name + ", ist ein " + rasse + ", ist " + farbe + " und ist " + alter+ " Jahre alt.");
    }
    public boolean stockBringen(){
        System.out.println("Kann der Hund Stock bringen? Y/N");
        Scanner scanner = new Scanner(System.in);
        if(scanner.next().equals("Y")) {
            System.out.println("Er kann Stoeckchen bringen");
            return true;
        } else {
            System.out.println("Er kann NICHT Stoeckchen bringen (ts ts)");
            return false;
        }
    }
}
