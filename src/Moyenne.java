import java.util.Scanner;

public class Moyenne {

    private static Scanner scanner = new Scanner(System.in);

    public static void main (String [] args ) {

        double note1 = 0.;
        double note2 = 0.0;
        //double moyenne = 0.0;



        System.out.println("Veuillez entrer la première note :");
        note1 = scanner.nextDouble();

        System.out.println("Veuillez entrer la deuxième note :");
        note2 = scanner.nextDouble();

        //moyenne = (note1 + note2) / 2.0;

        System.out.print("La moyenne est de :" + moyenne(note1,note2));

    }

    /*********************************/
    static double moyenne (double note1, double note2) {
        return ((note1 + note2) / 2.0);
    }

}
