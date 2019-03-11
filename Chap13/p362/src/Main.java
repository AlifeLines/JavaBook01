public class Main {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Hello World!");
    }
    private static void method1() throws Exception {
        try {
            method2();
        }catch (Exception ex){
            throw new Exception("New info from method1",ex);
        }
    }
    private static void method2() throws Exception{
        throw new Exception("New info from method2");
    }
}
