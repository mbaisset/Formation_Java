import java.util.ArrayList;

public class AmicalNumbers {
    public static void main(String[] args) {
        int[] nombres = {1210, 45, 27, 220, 54, 284, 9890, 120, 1184};
        System.out.println("Les paires de nombres amicaux sont : ");
        afficherAmicaux(nombres);

    }

    /**********************************************************************/
    /*the aim of this function is to provide the list of the available divisors*/
    public static ArrayList NumberDivisors (int number) {
        ArrayList divisors = new ArrayList();

        for (int i = 1; i < number + 1; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    /************************************************************/
    //The aim of this function is to add all the divisors found for a number
    public static int DivisorSum (ArrayList divisor) {
        int sum = 0;
        for (int i=0; i < divisor.size(); i++) {
            sum = sum + (int)divisor.get(i);
        }
        return sum;
    }

    /*********************************************************/
    //the aim of this method is to display all the Friendly numbers and in only one occurence
    public static void afficherAmicaux (int [] nombres) {
        //for (int i = 0; i < nombres.length; i++) {
            //ArrayList div = new ArrayList();
            //div = NumberDivisors(nombres[i]);
            //for (int j = 0; j < div.size(); j++) {
                //System.out.print(div.get(j) + " ");
                //}
            //System.out.println();
            //    System.out.printf("The sum of the divisors is: %d%n", DivisorSum(div));
        //}

        for (int i = 0; i < nombres.length; i++) {
            for (int j=i+1; j < nombres.length; j++) {
                if (DivisorSum(NumberDivisors(nombres[i])) == DivisorSum(NumberDivisors(nombres[j]))) {
                    System.out.println(nombres[i] + " " + nombres[j]);
                    break;
                }
            }
        }
    }

}
