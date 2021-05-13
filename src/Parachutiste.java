import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double g = 9.81;

        double v0 = 0.0;
        double t0 = 0.0;

        double vitesse = v0;
        double hauteur = h0;
        double accel = g;
        double t = t0;

        //surface parachutiste en m²
        double surface = 2.0;

        double s = surface / masse;
        boolean vitesseSonDepassee = false;
        boolean vitesseMaximaleAtteinte = false;
        boolean parachuteOuvert = false;

        while (hauteur > 0) {
            if ((vitesse > 343) && (vitesseSonDepassee == false)) {
                System.out.println("## Felix depasse la vitesse du son");
                vitesseSonDepassee = true;
            }


            if ((hauteur < 2500) && (parachuteOuvert == false) && (t != 0)) {
                System.out.println("## Felix ouvre son parachute");
                parachuteOuvert = true;
                surface = 25.00;
                s = surface / masse;
                t0 = t;
                v0 = vitesse;
                h0 = hauteur;
            }

            System.out.printf("%.0f, %.4f, %.4f, %.5f\n",t, hauteur, vitesse, accel);
            ++t;
            double q = Math.exp(-s * (t - t0));
            vitesse = ((g / s) * (1 - q)) + (v0 * q);
            hauteur = h0 - ((g /s ) * (t - t0)) - (((v0 - (g / s)) / s) * (1 - q));
            accel = g - (s * vitesse);

            if ((accel < 0.5) && (vitesseMaximaleAtteinte == false)) {
                System.out.println("## Felix a atteint sa vitesse maximale");
                vitesseMaximaleAtteinte = true;
            }
        }

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
