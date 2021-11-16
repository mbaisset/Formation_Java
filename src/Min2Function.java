public class Min2Function {
    public static void main (String[] args) {
        double number1 = 6.2;
        double number2 = -3.05;
        double number3 = 0.75;

        System.out.format("Le nombre le plus petit entre %.2f et %.2f est %.2f", number1, number2, Min2(number1, number2));
        System.out.println();
        System.out.format("Le nombre le plus petit entre %.2f ,%.2f et %.2f est %.2f", number1, number2, number3, Min3(number1, number2, number3));
    }

    public static double Min2 (double number1, double number2){
        if (number1 < number2) {
            return number1;
        } else {
            return number2;
        }

    }

    public static double Min3 (double number1, double number2, double number3){
        return Min2(number1, Min2(number2, number3));
    }
}
