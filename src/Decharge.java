import java.util.Scanner;
//import java.util.Arrays;
import java.text.DecimalFormat;

public class Decharge {
    private static DecimalFormat df = new DecimalFormat("#.000");

    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/

    static int[] troisPlusProches(int x, int y, int[] coordonneesHabitations) {
        int[] troisPlusProchesTep = new int[6];

        int[] coordonneesHabitationsTemp = new int[coordonneesHabitations.length];
        System.arraycopy(coordonneesHabitations, 0, coordonneesHabitationsTemp, 0, coordonneesHabitations.length);

        for (int i = 0; i < 3; i++) {
            int lePlusProche = plusProche(x, y, coordonneesHabitationsTemp);
            troisPlusProchesTep[2 * i] = coordonneesHabitations[2 * lePlusProche];
            troisPlusProchesTep[2 * i + 1] = coordonneesHabitations[2 * lePlusProche + 1];
            coordonneesHabitationsTemp[lePlusProche * 2] = 1000000;
            coordonneesHabitationsTemp[lePlusProche * 2 + 1] = 1000000;
        }

        return troisPlusProchesTep;
    }

    static double calculerDistance(int x, int y, int i, int i1) {
        double distance = Math.sqrt(Math.pow((x - i), 2.0) + Math.pow((y - i1), 2.0));
        return distance;
    }

    static int[] meilleurePlace(int x, int y, int[] coordonneesHabitations) {
        int[] mP = new int[2];
        mP[0] = 0;
        mP[1] = 0;

        int[] troisPlusProcheTemp = troisPlusProches (x,y,coordonneesHabitations);
        int cx = 0;
        int cy = 0;

        for (int i = 0; i < 3; i++) {
            cx = cx + troisPlusProcheTemp[2 * i];
            cy = cy + troisPlusProcheTemp[2 * i + 1];
        }

        mP[0] = cx / 3;
        mP[1] = cy / 3;

        return mP;
    }

    static int plusProche(int x, int y, int[] coordonneesHabitations) {
        double distancePlusProche = calculerDistance(x, y, coordonneesHabitations[0], coordonneesHabitations[1]);
        int coordonneesPlusProche = 0;

        for (int i = 2; i < coordonneesHabitations.length; i = i + 2) {
            double distanceTemp = calculerDistance(x, y, coordonneesHabitations[i], coordonneesHabitations[i + 1]);

            if (distanceTemp < distancePlusProche) {
                distancePlusProche = distanceTemp;
                coordonneesPlusProche = i;
            }
        }

        return coordonneesPlusProche / 2;
    }


    /*******************************************
     * Ne rien modifier apres cette ligne.
     *******************************************/

    public static void afficheTroisPlusProches(int x, int y, int[] coordonneesHabitations) {
        int[] tpp = troisPlusProches(x, y, coordonneesHabitations);

        System.out.println("(" + x + "," + y + ") est a :");
        for (int i = 0; i < 3; i++) {
            System.out.println("    " + df.format(calculerDistance(x, y, tpp[2 * i], tpp[2 * i + 1])) + " de (" + tpp[2 * i] + "," + tpp[2 * i + 1] + ")");
        }
    }


    //PROGRAMME PRINCIPAL
    public static void main(String args[]) {

        int[] coordonneesHabitations = {
                9, 30, 18, 8, 3, 18, 25, 36
        };

        // Lecture des donnees
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez la coordonnee x de la decharge: ");
        int x = clavier.nextInt();
        System.out.print("Entrez le coordonnee y de la decharge: ");
        int y = clavier.nextInt();

        // trouve les coordonnees de l'habitation la plus proche
        // (identifiees par l'indice correspondant dans le tableau
        // de coordonnees)
        int plusProche = plusProche(x, y, coordonneesHabitations);
        System.out.println("--- Question 1 ---");
        System.out.println("Coordonnees de l'habitation la plus proche de la decharge :");
        System.out.println("(" + coordonneesHabitations[plusProche * 2] + "," + coordonneesHabitations[plusProche * 2 + 1] + ") ; distance = " +
                df.format(calculerDistance(x, y, coordonneesHabitations[plusProche * 2], coordonneesHabitations[plusProche * 2 + 1]))  + " metres");

        // trouve les coordonnees des 3 habitations les plus proches et affiche les coordonnees

        System.out.println("--- Question 2 ---");
        System.out.println("Coordonnees des 3 habitations les plus proches de la decharge :");
        afficheTroisPlusProches(x, y, coordonneesHabitations);

        // affiche le centre de gravite des 3 plus proches (la meilleure place)
        int[] grav = meilleurePlace(x, y, coordonneesHabitations);
        System.out.println("--- Question 3 ---");
        System.out.println("Coordonnees de la meilleure place pour la decharge :");
        System.out.println("(" + grav[0] + "," + grav[1] + ")");
        clavier.close();
    }

}
	
