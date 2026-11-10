import java.util.Scanner;

public class RockPaperScissorsJudge {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Player 1 (rock/paper/scissors): ");
            String player1 = input.next().toLowerCase();
            
            System.out.print("Player 2 (rock/paper/scissors): ");
            String player2 = input.next().toLowerCase();
            
            boolean valid1 = player1.equals("rock")
                    || player1.equals("paper")
                    || player1.equals("scissors");
            
            boolean valid2 = player2.equals("rock")
                    || player2.equals("paper")
                    || player2.equals("scissors");
            
            if (!valid1 || !valid2) {
                System.out.println("Invalid Input");
            } else if (player1.equals(player2)) {
                System.out.println("Draw");
            } else if ((player1.equals("rock") && player2.equals("scissors"))
                    || (player1.equals("paper") && player2.equals("rock"))
                    || (player1.equals("scissors") && player2.equals("paper"))) {
                System.out.println("Player 1 Wins");
            } else {
                System.out.println("Player 2 Wins");
            }
        }
    }
}