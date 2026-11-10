import java.math.BigInteger;
import java.util.Scanner;

public class CollatzSteps {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            BigInteger n = input.nextBigInteger();
            
            if (n.signum() <= 0) {
                System.out.println("Number must be positive.");
            } else {
                BigInteger one = BigInteger.ONE;
                BigInteger two = BigInteger.valueOf(2);
                BigInteger three = BigInteger.valueOf(3);
                
                long steps = 0;
                
                System.out.print(n);
                
                while (!n.equals(one)) {
                    if (n.mod(two).equals(BigInteger.ZERO)) {
                        n = n.divide(two);
                    } else {
                        n = n.multiply(three).add(one);
                    }
                    
                    steps++;
                    System.out.print(" " + n);
                }
                
                System.out.println();
                System.out.println("Steps = " + steps);
            }
        }
    }
}