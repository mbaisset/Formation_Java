import java.util.ArrayList;
import java.util.Scanner;

class TrancheMax {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Entree de la matrice
        System.out.println("Saisie de la matrice :");
        String matrice = clavier.nextLine();
        System.out.format("Matrice saisie :\n%s\n", matrice);
        clavier.close();

        // Validation de la matrice
        if (!checkFormat(matrice)) {
            return;
        }

        // Trouver la liste des lignes avec le plus grand nombre de 1 consecutif
        // Ces numéros de lignes sont stockés dans un tableau dynamique
        ArrayList<Integer> maxConsecutifList = findConsecutiveList(matrice);

        if (maxConsecutifList.isEmpty()) {
            System.out.println("Pas de lignes avec des 1 !");
        } else {
            System.out.println("Ligne(s) avec le plus de 1 consecutifs :");
            for (Integer index : maxConsecutifList) {
                System.out.println(index);
            }
        }
    }


    /*******************************************
     * Completez le programme a partir d'ici.
     *******************************************/

    static boolean checkFormat(String matrice) {

        if (matrice.length() == 0) {
            System.out.println("Matrice vide !");
            return false;
        }

        for (int i = 0; i < matrice.length(); i++) {
            switch (matrice.charAt(i)) {
                case '0':
                case ' ':
                case '1':
                    break;

                default:
                    System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");
                    return false;
            }
        }
        return checkLineLength(matrice);
    }

    static ArrayList<Integer> findConsecutiveList(String matrice) {
        ArrayList<Integer> consecutiveList = new ArrayList<>();

        int maxUn = 0;
        String[] matriceSplitted = matrice.trim().split(" {1,}");
        for (int i = 0; i < matriceSplitted.length; i++) {
            int nbUnConsecutif = 0;
            int nbMaxUnConsecutifLigne = 0;

            if (matriceSplitted[i].length() == 1) {
                if (matriceSplitted[i].charAt(0) == '1') {
                    nbMaxUnConsecutifLigne = 1;
                }
            } else {


                for (int j = 1; j < matriceSplitted[i].length(); j++) {
                    if (matriceSplitted[i].charAt(j) == '1' && (matriceSplitted[i].charAt(j - 1)) == '1') {
                        nbUnConsecutif++;
                        if (nbUnConsecutif > nbMaxUnConsecutifLigne) {
                            nbMaxUnConsecutifLigne = nbUnConsecutif;
                        }
                    } else {
                        nbUnConsecutif = 0;
                    }
                }
            }
            if (nbMaxUnConsecutifLigne > maxUn) {
                maxUn = nbMaxUnConsecutifLigne;
                consecutiveList.clear();
                consecutiveList.add(i);
            } else if (nbMaxUnConsecutifLigne == maxUn && nbMaxUnConsecutifLigne != 0) {
                consecutiveList.add(i);
            }
        }


        return consecutiveList;
    }

    static boolean checkLineLength(String matriceLine) {
        String[] matriceLineSplitted = matriceLine.trim().split(" {1,}");
        int basicLength = 0;

        if (matriceLineSplitted.length > 0) {
            basicLength = matriceLineSplitted[0].length();
        }

        for (int i = 1; i < matriceLineSplitted.length; i++) {
            if (matriceLineSplitted[i].length() != basicLength) {
                System.out.println("Matrice invalide, lignes de longueurs differentes !");
                return false;
            }
        }

        return true;
    }

    /*System.out.println("Matrice invalide, lignes de longueurs differentes !");
    System.out.println("Matrice vide !");
    System.out.println("Matrice invalide : seuls '1', '0' et ' ' sont admis !");

    /*******************************************
     * Ne rien modifier apres cette ligne
     *******************************************/
}
