import java.util.Scanner;

public class Intervalle {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double x;

        System.out.print("Entrez un réel :");
        x = scanner.nextDouble();

        if (x < -10.0) {
            System.out.println("x n'appartient pas à I");
        } else if (x < -2.0) {
            System.out.println("x appartient à I");
        } else if (x == -2.0) {
            System.out.println("x appartient à I");
        } else if (x < 0.0) {
            System.out.println("x n'appartient pas à I");
        } else if (x == 0.0) {
            System.out.println("x n'appartient pas à I");
        } else if (x < 1.0) {
            System.out.println("x appartient à I");
        } else if (x == 1.0) {
            System.out.println("x appartient à I");
        } else if (x < 2.0) {
            System.out.println("x n'appartient pas à I");
        }  else if (x < 3.0) {
            System.out.println("x appartient à I");
        } else {
            System.out.println("x n'appartient pas à I");
        }

    }
}
