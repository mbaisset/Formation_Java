import java.util.Scanner;

public class Rebonds1 {
    private static Scanner scanner = new Scanner(System.in);
    final static double G = 9.81;

    public static void main (String [] args) {
        double h0;
        double eps;
        int nbr;
        double v = 0.0;
        double hRebond = 0.0;

        //Saisie de H0 par l'utilisateur
        do {
            System.out.print("Entrez la valeur pour H0 (H0 >= 0) :");
            h0 = scanner.nextDouble();
            if (h0 < 0) {
                System.out.println("La valeur entrée pour H0 est négative");
            }

        } while (h0 < 0 );

        //Saisie de eps par l'utilisateur
        do {
            System.out.print("Entrez la valeur pour eps (0 <= eps < 1) :");
            eps = scanner.nextDouble();
            if ((eps < 0) || (eps >= 1)) {
                System.out.println("La valeur entrée pour eps n'est pas comprise entre O inclus et 1 non inclus");
            }

        } while ((eps < 0 ) || (eps >= 1));

        //Saisize de nbr par l'utilisateur
        do {
            System.out.print("Entrez la valeur pour le nombre de rebond (nbr >= 0) :");
            nbr = scanner.nextInt();
            if (nbr < 0) {
                System.out.println("La valeur entrée pour nbr est négative");
            }

        } while (nbr < 0 );

        //Calcul de la vitesse initiale de la balle avant le premier rebond
        v = Math.sqrt(2 * h0 * G);

        for (int i = 0; i < nbr; ++i) {
            v = eps * v;
            hRebond = Math.pow(v, 2) / (2 * G);
        }

        System.out.println(v);
        System.out.println(hRebond);
    }

}
