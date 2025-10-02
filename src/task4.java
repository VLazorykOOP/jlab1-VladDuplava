import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the text:");
        String text = in.nextLine();
        String[] words = text.split("[ ,.:;!?\\-]+");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() == 0) {
                continue;
            }
            char firstLetter = word.charAt(0);
            String newWord = "" + firstLetter;

            for (int j = 1; j < word.length(); j++) {
                char currentLetter = word.charAt(j);
                if (currentLetter != firstLetter) {
                    newWord = newWord + currentLetter;
                }
            }
            System.out.print(newWord + " ");
        }
        in.close();
    }
}