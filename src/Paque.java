import java.util.Scanner;

public class Paque {
    private final static Scanner CLAVIER = new Scanner(System.in);

    public static void main (String[] args) {
        demanderAnnee();

    }

    static int demanderAnnee () {
        int annee = 0;

        while ((annee < 1583) || (annee > 4000)){
            System.out.print("Entrez une annee (1583-4000): ");
            annee = CLAVIER.nextInt();
        }
        System.out.println(annee);
        return annee;
    }


}
