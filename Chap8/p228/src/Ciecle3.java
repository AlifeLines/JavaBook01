public class Ciecle3 {
    private double radius = 1;
    private static int numberofObjects = 0;

    public Ciecle3() {
        numberofObjects++;
    }

    public Ciecle3(double newradius) {
        this.radius = newradius;
        numberofObjects++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        radius = (newRadius >= 0) ? newRadius : 0;
    }

    public static int getNumberofObjects() {
        return numberofObjects;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}