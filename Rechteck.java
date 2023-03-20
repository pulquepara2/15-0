public class Rechteck {
    private double breite;
    private double hoehe;

    public Rechteck(double b, double h){
        breite = b;
        hoehe = h;
    }
    //Liefert den Wert der Variable zurueck
    public double getWidth(){
        return breite;
    }
    public double getHeight(){
        return hoehe;
    }
    //setzt den Wert der Variable um
    public void setWidth(double breite){
        this.breite = breite;
    }
    public void setHeight(double hoehe){
        this.hoehe = hoehe;
    }
    //Logik im Programm
    public double getArea(){
        double area = breite * hoehe;
        System.out.println("Die Flaeche betraegt: " + area);
        return area;
    }
    public double getPerimeter(){
        double perimeter = 2 *(breite+hoehe);
        System.out.println("Der Umfang betraegt: " + perimeter);
        return perimeter;
    }
}
