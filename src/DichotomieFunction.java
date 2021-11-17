import java.util.Scanner;

public class DichotomieFunction {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int MIN = 1;
        final int MAX = 100;

        System.out.format("Veuillez penser à un nombre entre %d et %d%n", MIN, MAX);
        //String reponse = scanner.nextLine();
        System.out.format("Votre nombre est: %d  ", Recherche(MIN-1,MAX+1));

    }

    public static int Recherche (int borneInf, int borneSup){
        int pivot = 0;

        pivot = (borneInf+borneSup)/2;

        System.out.format("Le nombre est il <, > ou = à : %d  ", pivot);
        String reponse = scanner.nextLine();
        if (reponse.equals("=")) {
            return pivot;
        } else if (reponse.equals(">")){
            return Recherche(pivot, borneSup);
        } else {
            return Recherche(borneInf, pivot);
        }

    }

}
