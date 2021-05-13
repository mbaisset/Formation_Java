import java.util.Scanner;

public class Cesure {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] phrase = lirePhrase();
        for (int i = 0; i < phrase.length; i++) {
            cesure(phrase[i]);
            //System.out.println(phrase[i]);
            //System.out.println("Que des voyelles :" + queVoyelles(phrase[i]));
        }
    }

    static String[] lirePhrase() {
        // A compléter:
        // retourne un tableau de chaines de caractères
        // introduits par l'utilisateur
        int nbMotsphrase = 0;

        // Request to the user to give the number of words of the phrase
        System.out.print("Donnez le nombre de mots dans votre phrase : ");
        nbMotsphrase = scanner.nextInt();
        System.out.println();

        //Set the phraseLue array to the number of words given by the user
        String[] phraseLue = new String[nbMotsphrase];

        //Fill the phraseLue array with the words written by the user
        for (int i = 0; i < nbMotsphrase; i++) {
            System.out.print("Donnez le mot " + (i+1) + " : "  );
            phraseLue[i] = scanner.next();
            //System.out.println();
        }

        return  phraseLue;

    }

    static boolean voyelle(char c) {
        // A compléter:
        // teste si un caractère est une voyelle
        if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u') || (c == 'y')) {
            return true;
        }
        else {
            return false;
        }
    }

    static boolean queVoyelles(String s) {
        // A compléter:
        // teste si une chaîne ne contient que des voyelles
        // utilise la méthode voyelle

        for (int i = 0; i < s.length(); i++) {
            if (voyelle(s.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    static void cesure(String mot) {
        // A compléter:
        // détermine la césure d'un mot donné et effectue les affichages
        // correspondants (voir exemple de déroulement)
        //check if the string is containing only voyelles up to length(string) - 1
        //System.out.println("Le mot à étudier est :" + mot);
        if (queVoyelles(mot.substring(1,mot.length() - 1))) {
            //System.out.println("Dans cesure");
            //System.out.println("Affichage du mot: " + mot);
            System.out.println(mot);
        }
        else {
            //System.out.println("Dans cesure mais passé if");
            for(int i = 1; i < mot.length() - 1; i++) {
                //System.out.println(mot.charAt(i));
                if ((voyelle(mot.charAt(i))) & !voyelle(mot.charAt(i+1))) {
                    //System.out.println("valeur de i: " + i);
                    //System.out.println("valeur de la substring: " + mot.substring(0,i+1));
                    System.out.println(mot.substring(0,i+1) + "-");
                    String nouveauMot = mot.substring(i+1,mot.length());
                    //System.out.println("nouveauMot : " + nouveauMot);
                    cesure(nouveauMot);
                    break;
                }
            }
        }
    }

}
