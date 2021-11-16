import java.util.Scanner;

public class DichotomieFunction {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int MIN = 1;
        final int MAX = 100;

        System.out.format("Veuillez penser à un nombre entre %d et %d", MIN, MAX);
        boolean reponse = scanner.nextBoolean();

    }

    public static int Recherche (int borneInf, int borneSup){
        int number = (borneSup-borneInf)/2;

        System.out.format("Le nombre est il <, > ou = à : %d", number;
        String reponse = scanner.nextLine();
        if (reponse.equals("=")) {
            return
        }
    }

}
