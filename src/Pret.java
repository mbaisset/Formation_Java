import java.util.Scanner;

public class Pret {
    private static Scanner scanner = new Scanner(System.in);

    static public void main (String [] args) {
        int s0 = 0;
        int r = 0;
        double ir = 0.0;
        //int sommeRestante = s0;
        int nombreMois = 0;
        double i = 0;

        do {
            System.out.print("Entrez le montant initial du prêt:");
            s0 = scanner.nextInt();
            if (s0 <= 0) {
                System.out.println("Le montant est inférieur ou égal à 0");
            }
        } while (s0 <= 0);

        do {
            System.out.print("Entrez le montant du remboursement:");
            r = scanner.nextInt();
            if (r <= 0) {
                System.out.println("Le montant du remboursement est inférieur ou égal à 0");
            }
        } while (r <= 0);

        do {
            System.out.print("Entrez le montant de l'intérêt:");
            ir = scanner.nextDouble();
            if (ir < 0 || ir > 1) {
                System.out.println("Les intérêts entrés ne sont pas compris entre 0 et 1");
            }
        } while (ir < 0 || ir > 1);

        while (s0 > 0) {
            i = i + (ir * s0);
            s0 = s0 - r;
            ++nombreMois;
            System.out.println(s0);
            System.out.println(nombreMois);
            System.out.println(i);
        }
    }

}
