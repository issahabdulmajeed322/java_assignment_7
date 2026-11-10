import java.util.Scanner;

public class BatteryWarning {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter battery percentage: ");
            int battery = input.nextInt();

            if (battery < 20) {
                System.out.println("Low Battery - Please Charge");
            } else {
                System.out.println("Battery OK");
            }
        }
    }
}