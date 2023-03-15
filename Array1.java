import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {

        int[] meinArray = new int[100];
        int geradezahl = 2;

        for (int i = 0; i <= 99; i++) {
            meinArray[i] = geradezahl;
            geradezahl = geradezahl +2;
        }
        System.out.println(Arrays.toString(meinArray));
    }
}