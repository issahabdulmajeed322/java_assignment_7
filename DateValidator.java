import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter day: ");
            int day = input.nextInt();
            
            System.out.print("Enter month: ");
            int month = input.nextInt();
            
            System.out.print("Enter year: ");
            int year = input.nextInt();
            
            int daysInMonth = 0;
            
            boolean leapYear = (year % 4 == 0 && year % 100 != 0)
                    || year % 400 == 0;
            
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
                case 4, 6, 9, 11 -> daysInMonth = 30;
                case 2 -> daysInMonth = leapYear ? 29 : 28;
            }
            
            if (year >= 1 && day >= 1 && day <= daysInMonth) {
                System.out.println("Valid Date");
            } else {
                System.out.println("Invalid Date");
            }
        }
    }
}