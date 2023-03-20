public class Katze {
    String name;
    int alter;
    String rasse;
    boolean kannTrick;

    public Katze(String n, int a, String r, boolean kt){
        name = n;
        alter = a;
        rasse = r;
        kannTrick = kt;
    }
    public void knurren() {
        System.out.println("knurrrrrr");
    }

    public boolean kannTrick() {
        if (true) {
            System.out.println("Trick gelungen");
            return true;
        } else {
            System.out.println("Trick nicht gelungen");
            return false;
        }


    }
    public void gibInfos() {
        System.out.println("Die Katze heißt " + name + ",sie ist eine " + rasse + " und " + alter + " Jahre alt.");
    }
}
