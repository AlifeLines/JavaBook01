public class Main {

    public static void main(String[] args) {
        StackofIntegers stackofIntegers = new StackofIntegers();
        for(int i = 0;i<17;i++){
            stackofIntegers.push(i);
        }

        while (!stackofIntegers.empty()){
            System.out.print(stackofIntegers.pop()+" ");
        }
    }
}
