public class CalculApprocheIntegraleFunction {
    public static void main(String[] args) {

        int a = 500;
        int b = 1500;

        double c = IntegreCarre(a,b);
        System.out.println("a : " + a);
        System.out.println(Carre(a));
        System.out.println("b : " + b);
        System.out.println("c : " + c);

    }

    public static double IntegreCarre (int a, int b){
        double int1 = ((b-a)/840) * (41*Carre(a));

        return int1;
        //return (((b-a)/840)*(41*Carre(a) + 216 * Carre((5*a + b)/6) + 27 * Carre((2*a + b)/3)+ 272 * Carre((a+b)/2) + 27 * Carre((a + 2*b)/3) + 216 * Carre((a + 5*b)/6) + 41 * Carre(b)));
    }

    public static double Carre (int number){
        return number * number;
    }


}
