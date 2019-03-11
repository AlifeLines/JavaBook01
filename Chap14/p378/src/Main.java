public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        String s1 = "abcdef";
//        String s2 = "abcdee";
//        String s3 = (String) Max.max(s1,s2);
        ComparableRectangle rectangle01 = new ComparableRectangle(4,5);
        ComparableRectangle rectangle02 = new ComparableRectangle(3,6);
        System.out.println(Max.max(rectangle01,rectangle02));
        System.out.println( rectangle01.compareTo(rectangle02));
    }
}
