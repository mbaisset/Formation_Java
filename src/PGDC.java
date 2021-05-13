import java.util.Scanner;

public class PGDC {
    private static Scanner scanner = new Scanner(System.in);


    public static void main (String[] args) {

        int a;
        int b;

        System.out.print("Entrez un nombre positif :");
        a = scanner.nextInt();

        System.out.print("Entrez un nombre positif :");
        b = scanner.nextInt();
        System.out.print("Le plus grand diviseur commun de " + a + " et " + b + " est ");

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
