import java.util.Scanner;

public class Figures {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        for (int i = 1; i < 10; ++i) {
            System.out.print(i);
        }

        System.out.println();
        System.out.println("Exercice suivant");
        System.out.println();

        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j < 10; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercice suivant");
        System.out.println();

        for (int i = 1; i < 10; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercice suivant");
        System.out.println();

        for (int i = 1; i < 10; ++i) {
            for (int k = 1; k < 10 - i; ++k) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; ++j) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Exercice suivant");
        System.out.println();

        int n = 0;

        do {
            System.out.println("Entrez le nombre n:");
            n = scanner.nextInt();
        } while (n < 0);

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - i; ++j) {
                System.out.print(" ");
            }

            for (int k = 0; k <= i; ++k) {
                System.out.print("*");
            }

            for (int l = 0; l < i; ++l) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
