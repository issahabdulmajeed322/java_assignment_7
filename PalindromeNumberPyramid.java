import java.util.Scanner;

public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter N (1-9): ");
            int n = input.nextInt();
            
            if (n < 1 || n > 9) {
                System.out.println("N must be between 1 and 9.");
            } else {
                for (int row = 1; row <= n; row++) {
                    for (int space = 1; space <= n - row; space++) {
                        System.out.print(" ");
                    }
                    
                    for (int number = 1; number <= row; number++) {
                        System.out.print(number);
                    }
                    
                    for (int number = row - 1; number >= 1; number--) {
                        System.out.print(number);
                    }
                    
                    System.out.println();
                }
            }
        }
    }
}