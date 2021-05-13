import java.util.Scanner;

public class Scalaire {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args) {
        //Déclaration de la taille des vecteurs
        int nMax = 0;

        //Demande de la taille des vecteurs à l'utilisateur
        do {
            System.out.println("Entrez une valeur pour nMax comprise entre 1 et 10 :");
            nMax = scanner.nextInt();
            if (nMax < 1) {
                System.out.println("La valeur de nMax est trop petite");
            }
            if (nMax > 10) {
                System.out.println("La valeur de nMax est supérieure à 10");
            }
        } while ((nMax < 1) || (nMax > 10));

        //Déclaration des vecteurs en fonction de la taille nMax
        double [] v1 = new double [nMax];
        double [] v2 = new double [nMax];

        //Construction du vecteur v1
        for (int i =0; i < nMax; ++i) {
            System.out.println("Entrez la valeur " + (i + 1) + " pour le vecteur v1: ");
            v1[i] = scanner.nextDouble();
        }

        //Construction du vecteur v2
        for (int i = 0; i < nMax; ++i) {
            System.out.println("Entrez la valeur " + (i + 1) + " pour le vecteur v2: ");
            v2[i] = scanner.nextDouble();
        }

        //Calcul du produit scalaire
        double produitScalaire = 0.0;
        for (int i = 0; i < nMax; ++i) {
            produitScalaire = produitScalaire + (v1[i] * v2[i]);
        }

        //Affichage du produit scalaire
        System.out.println("Le produit scalaire des 2 vecteurs est égale à :" + produitScalaire);
    }
}
