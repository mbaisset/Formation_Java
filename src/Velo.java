import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int nbHeures1Franc = 0;
        int nbHeures2Franc = 0;

        if ((debut > 24) || (debut < 0) || (fin < 0) || (fin > 24) ) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        } else if (debut == fin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        } else if (debut > fin) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        }
        else {
            if ((fin <= 7) || (debut >= 17)) {
                nbHeures1Franc = fin - debut;
            } else {
                if (debut <= 7) {
                    nbHeures1Franc = 7 - debut;
                }
                if (fin >= 17) {
                    nbHeures1Franc = fin - 17 + nbHeures1Franc;
                }

                nbHeures2Franc = fin - debut - nbHeures1Franc;
            }

            System.out.println("Vous avez loué votre vélo pendant");
            if (nbHeures1Franc > 0) System.out.println(nbHeures1Franc + " heure(s) au tarif horaire de 1.0 franc(s)");
            if (nbHeures2Franc > 0) System.out.println(nbHeures2Franc + " heure(s) au tarif horaire de 2.0 franc(s)");
            System.out.print("Le montant total à payer est de ");
            System.out.print(nbHeures1Franc + (2 * nbHeures2Franc) + ".0");
            System.out.println(" franc(s).");
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
