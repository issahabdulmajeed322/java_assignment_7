import java.util.Scanner;

public class LargestofThreeNumbers {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter three integers: ");
            int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        if (a == b && b == c) {
            System.out.println("All Numbers Are Equal");
        } else if (a >= b && a >= c) {
            System.out.println("Largest: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Largest: " + b);
        } else {
            System.out.println("Largest: " + c);
        }

        input.close();
    }
 }
}
