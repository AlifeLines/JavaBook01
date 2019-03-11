public class Main {
    public static void main(String[] args) {
        Object object_01 = new Circle4(1);
        Object object_02 = new Rectanglel(1, 1);
        displayObject(object_01);
        displayObject(object_02);
    }

    private static void displayObject(Object object) {
        if (object instanceof Circle4) {
            System.out.println("Area: " + ((Circle4) object).getArea()+".Diameter is:"+((Circle4) object).getDiameter());
        } else if (object instanceof Rectanglel) {
            System.out.println("Area: " +((Rectanglel) object).getArea());
        }
    }
}
