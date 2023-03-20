public class Main {
    public static void main(String[] args) {
        Rechteck r1 = new Rechteck(3.8, 4.5);
        Rechteck r2 = new Rechteck(9, 27);

        r1.getArea();
        r2.getArea();

        r1.getPerimeter();
        r2.getPerimeter();

        r1.setWidth(4);
        r1.setHeight(25);

        r1.getArea();
        r1.getPerimeter();
    }
}
