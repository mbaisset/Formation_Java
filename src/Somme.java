import java.util.Scanner;

public class Somme {
    static Scanner keyboard = new Scanner(System.in);

    public static void main (String[] args) {

        System.out.println("Please, enter your number: ");
        System.out.println("The sum of the n first intergers is : " + somme (keyboard.nextInt()));

    }

    static int somme (int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + somme(n-1);
        }
    }
}
