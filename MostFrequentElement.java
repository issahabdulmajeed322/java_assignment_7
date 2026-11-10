public class MostFrequentElement {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 2, 7, 4, 7, 9};

        int mostFrequent = numbers[0];
        int highestCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            int count = 0;

            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }

            if (count > highestCount) {
                highestCount = count;
                mostFrequent = numbers[i];
            }
        }

        System.out.println(
            "Most frequent = " + mostFrequent
            + " (" + highestCount + " times)"
        );
    }
}