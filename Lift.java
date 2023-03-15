import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        boolean istHaus = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Handelt es sich um ein Haus? y/n: ");
        String eingabe = scanner.next();
        if(eingabe.toLowerCase().equals("y")){
            istHaus = true;
        }
        //Wir möchten alle möglichen Stockwerke als Gast sehen

        for (int i = 1; i <= 68; i++) {//68 Stockwerke
            //Stockwerke 10,19,28,36,55 sind nicht für Gäste zugängllich

            if (i == 10 || i == 19 || i == 28 || i == 36 || i == 55) {
                continue;
            }
            //Ausgabe der möglichen auswählbaren Stockwerke, für die Gäste

            System.out.println("Etage " + i);
            //Falls es sich um einen Lift in einem normalem Haus handelt, dann maximal 4 Stockwerke ausgeben!
            if (istHaus && i == 4){
                break;
            }
        }
    }
}