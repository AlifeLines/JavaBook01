import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        System.out.println("50!" + factorial(50));
    }

    private static BigInteger factorial(long n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
