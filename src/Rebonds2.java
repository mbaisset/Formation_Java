import java.util.Scanner;

public class Rebonds2 {
    private static Scanner scanner = new Scanner(System.in);
    final static double G = 9.81;

    public static void main (String [] args) {
        double h0;
        double eps;
        double v = 0.0;
        double hRebond = 0.0;
        double hFin;
        int nbr = 0;

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

        //Saisize de la hauteur finale par l'utilisateur
        do {
            System.out.print("Entrez la valeur pour la hauteur finale après rebond (0 < Hauteur finale < H0) :");
            hFin = scanner.nextDouble();
            if (hFin <= 0) {
                System.out.println("La valeur entrée pour la hauteur finale après rebond est négative ou nulle");
            } else if (hFin > h0) {
                System.out.println("La valeuer entrée pour la hauteur finale est supérieure à la hauteur initiale");
            }

        } while ((hFin <= 0 ) || (hFin > h0));

        //Calcul de la vitesse initiale de la balle avant le premier rebond
        v = Math.sqrt(2 * h0 * G);

        do {
            v = eps * v;
            hRebond = Math.pow(v, 2) / (2 * G);
            ++nbr;
        } while (hRebond >= hFin);

        System.out.println(v);
        System.out.println(hRebond);
        System.out.println(nbr);
    }

}
