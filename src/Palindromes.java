import java.util.ArrayList;
import java.util.Scanner;

public class Palindromes {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        String phrase;
        ArrayList<Character> isPalyn = new ArrayList<Character>();
        boolean isPal = true;
        int demi = 0;

        System.out.println("Entrez une phrase : ");
        phrase = scanner.nextLine();

        phrase = phrase.toLowerCase();

        for (int i = 0; i < phrase.length(); ++i) {
            if (Character.isLetter(phrase.charAt(i))) {
                isPalyn.add(phrase.charAt(i));
            }
        }

        for (Character c : isPalyn) {
            System.out.print(c);
        }
        System.out.println();

        if ((isPalyn.size() % 2) == 0) {
            demi = isPalyn.size() / 2;
        } else {
            demi = (isPalyn.size() / 2) + 1;
        }

        for (int i = 0; i < demi; ++i) {
            System.out.println(isPalyn.get(i) + " vs " + isPalyn.get(isPalyn.size() - 1 - i));
            if (isPalyn.get(i) != isPalyn.get(isPalyn.size() - 1 - i)) {
                isPal = false;
            }
        }

        if (isPal == true) {
            System.out.println("C'est un palindrome!");
        } else {
            System.out.println("Ce n'est pas un palindrome");
        }

    }
}
