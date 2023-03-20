public class Justiz {

    public void strafeErrechnen(float geschw) {
        if (geschw < 60) {
            System.out.println("Keine Strafe");
        } else {
            System.out.println("100 Euro Strafe");
        }
    }
}