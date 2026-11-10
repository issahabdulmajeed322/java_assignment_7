import java.math.BigInteger;
import java.util.Scanner;

public class PowersofTwo {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter N (0 or greater): ");
            int n = input.nextInt();
            
            if (n < 0) {
                System.out.println("Invalid Input");
            } else {
                BigInteger value = BigInteger.ONE;
                
                System.out.print(value);
                
                for (int exponent = 1; exponent <= n; exponent++) {
                    value = value.multiply(BigInteger.valueOf(2));
                    System.out.print(" " + value);
                }
                
                System.out.println();
            }
        }
    }
}