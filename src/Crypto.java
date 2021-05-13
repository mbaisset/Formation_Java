import java.util.Scanner;

public class Crypto {

    static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    static final int DECALAGE = 4;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Veuillez entrer une chaine de caracteres : ");
        String s = scanner.nextLine();

        // la chaine a coder
        String aCoder = "";
        // la chaine codee
        String chaineCodee = "";

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for (int i = 0; i < s.length(); ++i) {
            if (ALPHABET.indexOf(s.charAt(i)) != -1) {
                aCoder= aCoder.concat( Character.toString(s.charAt(i)));
                if ((ALPHABET.indexOf(s.charAt(i)) + DECALAGE) < ALPHABET.length()) {
                    chaineCodee = chaineCodee.concat(Character.toString(ALPHABET.charAt(ALPHABET.indexOf(s.charAt(i) + DECALAGE))));
                } else {
                    chaineCodee = chaineCodee.concat(Character.toString(ALPHABET.charAt(ALPHABET.indexOf(s.charAt(i) + DECALAGE - ALPHABET.length()))));
                }
            } else if (Character.toString(s.charAt(i)).compareTo(" ") == 0) {
                aCoder = aCoder.concat(" ");
                chaineCodee = chaineCodee.concat(" ");
            }
        }


        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        System.out.format("La chaine initiale etait : '%s'\n", s);

        if (aCoder.isEmpty()) {
            System.out.println("La chaine a coder est vide.\n");
        } else {
            System.out.format("La chaine a coder est : '%s'\n", aCoder);
            System.out.format("La chaine codee est : '%s'\n", chaineCodee);
        }
    }
}
