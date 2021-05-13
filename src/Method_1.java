import java.util.Scanner;

public class Method_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        double note1;
        double note2;

        System.out.println("Enter the first note: ");
        note1 = scanner.nextDouble();

        System.out.println("Enter the second note: ");
        note2 = scanner.nextDouble();

        //System.out.println("The mean is : " + (note1 + note2)/2);
        System.out.println("The mean is: " +  moyenne (note1, note2));
    }

    static double moyenne (double note1, double note2){
        return (note1 + note2)/2;
    }
}
