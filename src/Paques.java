import java.util.Scanner;

public class Paques {
    private final static Scanner CLAVIER = new Scanner(System.in);

    public static void main (String[] args) {

        int year = demanderAnnee();
        int nbDays = datePaques(year);
        afficheDate(year, nbDays);

    }

    static int demanderAnnee () {
        int annee = 0;

        while ((annee < 1583) || (annee > 4000)){
            System.out.println("Entrez une annee (1583-4000): ");
            annee = CLAVIER.nextInt();
        }
        //System.out.println(annee);
        return annee;
    }

    static void afficheDate (int pAnnee, int pNbJours) {
        String mois;

        int jour = 0;


        if (pNbJours <= 31) {
            mois = "mars";
            jour = pNbJours;
        } else {
            mois = "avril";
            jour = pNbJours - 31;
        }

        System.out.print("Date de Paques en " + pAnnee + " : " + jour + " " + mois);

    }

    static int datePaques (int year){

        int siecle = year / 100;
        int p = (13 + 8 * siecle) / 25;
        int q = siecle / 4;
        int m = (15 - p + siecle - q) % 30;
        int n = (4 + siecle - q) % 7;
        int d = (m + 19 * (year % 19)) % 30;
        int e = (2 * (year % 4) + 4 * (year % 7) + 6 * d + n) % 7;
        int day = e + d +22;

        if ((e ==6) && ((d == 29) || ((d == 28) && ((11 * (m +1) % 30) < 19)))){
            day -= 7;
        }

        return day;
    }

}
