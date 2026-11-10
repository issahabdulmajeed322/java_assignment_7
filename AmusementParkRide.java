import java.util.Scanner;

public class AmusementParkRide {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter height in cm: ");
            double height = input.nextDouble();

            System.out.print("Enter age: ");
            int age = input.nextInt();

            System.out.print("Accompanied by an adult? (yes/no): ");
            String adult = input.next();

            if ((height >= 140 && age >= 10)
                    || (height >= 120 && adult.equalsIgnoreCase("yes"))) {
                System.out.println("Allowed");
            } else {
                System.out.println("Not Allowed");
            }
        }
    }
}