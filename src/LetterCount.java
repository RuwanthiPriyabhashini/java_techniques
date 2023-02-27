import java.util.Scanner;

public class LetterCount {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String str = input.nextLine();

            int[] counts = new int[26];

            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    c = Character.toLowerCase(c);
                    int index = c - 'a';
                    counts[index]++;
                }
            }

            System.out.println("Letter counts:");
            for (int i = 0; i < counts.length; i++) {
                char c = (char) ('a' + i);
                if (counts[i] > 0) {
                    System.out.println(c + ": " + counts[i]);
                }
            }
        }
    }
