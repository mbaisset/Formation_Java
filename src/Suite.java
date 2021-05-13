import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        for (int i = debut; i <= fin; ++i) {
            int result = i;
            int k = 0;

            do {
                if ((result % 3) == 0) {
                    result = result + 4;
                } else if ((result % 4) == 0) {
                    result = result / 2;
                } else {
                    result = result - 1;
                }
                ++k;

            } while ( result != 0);
            System.out.println(i + " -> " + k);
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
