import java.util.Scanner;

public class Fibonacci {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Donnez le nombre de la suite à calculer : ");

        int number_suite = scanner.nextInt();
        System.out.println();
        System.out.println("La réponse est : " + fibonacci_recursive(number_suite));        }


    private static int fibonacci_recursive (int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return fibonacci_recursive(number - 1) + fibonacci_recursive(number - 2);
        }
    }
}
