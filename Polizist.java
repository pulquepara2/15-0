import java.util.Scanner;

public class Polizist {

    public float geschwMessen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geschwindigkeit eingeben: ");
        float geschw = scanner.nextFloat();
        return geschw;
    }
}
