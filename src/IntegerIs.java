import java.util.Scanner;

public class IntegerIs {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int number = 0;
        String pairImpair = "Pair";
        String PositifNegatif = "Positif";


        System.out.print("Entrez un entier :");
        number = scanner.nextInt();

        if (number == 0) {
            System.out.println ("Le nombre est zéro (et il est pair)");
        }
        else {
            if (number > 0) {
                PositifNegatif = "Positif";
            } else {
                PositifNegatif = "Négatif";
            }

            if ((number % 2) == 0) {
                pairImpair = "Pair";
            } else {
                pairImpair = "Impair";
            }
            System.out.println ("Le nombre est " + PositifNegatif + " et " + pairImpair);
        }


    }
}
