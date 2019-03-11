public class Main {

    public static void main(String[] args) {
        Ciecle3 mycircle = new Ciecle3(6.0);
        System.out.println(mycircle.getRadius());
        System.out.println(mycircle.getArea());

        mycircle.setRadius(mycircle.getRadius() * 1.1);
        System.out.println(mycircle.getRadius());
        System.out.println(mycircle.getArea());

        System.out.println(Ciecle3.getNumberofObjects());
    }
}

