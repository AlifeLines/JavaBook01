public class Main {

    public static void main(String[] args) {
        int[] list_01 = {1, 2};
        int[] list_02 = list_01.clone();
        list_01[0] = 7;
        list_01[1] = 8;
        System.out.println("list1 is " + list_01[0] + "," + list_01[1]);
        System.out.println("list2 is " + list_02[0] + "," + list_02[1]);


        try {
            House house_01 = new House(1, 1750.50);
            House house_02 = (House) house_01.clone();
            System.out.println(house_02.compareTo(house_01));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
