import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter number of rows: ");
            int n = input.nextInt();
            
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    if ((row + col) % 2 == 0) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
                System.out.println();
            }
        }
    }
}