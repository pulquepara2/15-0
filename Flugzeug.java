public class Flugzeug {
    public static void main(String[] args) {
        boolean istAirbus = false;

        for (int i = 1; i <= 50; i++) {
            if (i == 13 || i == 17) {
                continue;
            }
            System.out.println("Reihe " + i);
            if (!istAirbus && i == 19) {
                break;
            }
            }
        }
    }