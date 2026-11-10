import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = input.nextLine();
            
            int count = 0;
            
            for (int i = 0; i < sentence.length(); i++) {
                char letter = Character.toLowerCase(sentence.charAt(i));
                
                if (letter == 'a' || letter == 'e'
                        || letter == 'i' || letter == 'o'
                        || letter == 'u') {
                    count++;
                }
            }
            
            System.out.println("Vowels = " + count);
        }
    }
}