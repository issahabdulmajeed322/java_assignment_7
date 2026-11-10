import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer: ");
            int number = input.nextInt();

            if (number % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
        }
    }
}