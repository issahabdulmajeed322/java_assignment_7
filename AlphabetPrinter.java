import java.util.Scanner;

public class AlphabetPrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter N (1-26): ");
        int n = input.nextInt();

        if (n < 1 || n > 26) {
            System.out.println("Invalid Input");
        } else {
            for (int i = 0; i < n; i++) {
                char letter = (char) ('A' + i);
                System.out.print(letter + " ");
            }
            System.out.println();
        }

        input.close();
    }
}