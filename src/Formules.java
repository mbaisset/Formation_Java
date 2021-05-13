import java.beans.Expression;
import java.util.Scanner;

public class Formules {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double x;

        System.out.print("Entrez un réel :");
        x = scanner.nextDouble();

        if ((1 - Math.exp(x)) == 0) {
            System.out.println("Expression 1 : indéfinie");
        } else {
            System.out.println("Expression 1 : " + x / (1 - Math.exp(x)));
        }

        if (x > 0.0) {
            if ((x - 1.0) == 0.0) {
                System.out.println("Expression 2 : indéfinie");
            } else {
                System.out.println("Expression 2 : " + x * Math.log(x) * Math.exp(2 / (x - 1)));
            }
        } else System.out.println("Expression 2 : indéfinie");

        if ((2.0 - x) == 0) {
            System.out.println("Expression 3 : indéfinie");
        } else if ((Math.pow(x,2) - 8*x) < 0.0) {
            System.out.println("Expression 3 : indéfinie");
        } else {
            System.out.println("Expression 3 : " + (-x - Math.sqrt(Math.pow(x , 2) - 8*x)) / (2 - x) );
        }

        if (x == 0) System.out.println("Expression 4 : indéfinie");
        else {
            if ((Math.pow(x,2) - (1 / x)) > 0) {
                if (((Math.sin(x) - (x / 20)) * Math.log(Math.sqrt(Math.pow(x,2) - (1 / x)))) >= 0) {
                    System.out.println("Expression 4 : " + Math.sqrt((Math.sin(x) - (x / 20)) * Math.log(Math.sqrt(Math.pow(x,2) - (1 / x)))));
                } else System.out.println("Expression 4 : indéfinie");
            } else System.out.println("Expression 4 : indéfinie");
        }
    }
}
