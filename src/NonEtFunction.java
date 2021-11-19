public class NonEtFunction {
    public static void main (String[] args) {
        boolean a = false;
        //boolean a = true;
        // boolean a = false;
        boolean b = true;
        //boolean b = false;

        boolean c =NonEt(a,b);

        System.out.format("a : %b%n", a);
        System.out.format("b : %b%n", b);
        System.out.format("NonEt de a et b : %b%n", c);
        c = Non(a);
        System.out.format("Non de a : %b%n", c);
        c = Et(a,b);
        System.out.format("Et de a et b : %b%n", c);
        c = Ou(a,b);
        System.out.format("Ou de a et b : %b%n", c);


    }
    public static boolean NonEt(boolean a, boolean b)
    {
        return !(a && b);
    }

    public static boolean Non (boolean a){
        return NonEt(a,a);
    }

    public static boolean Et (boolean a, boolean b){
        return Non(NonEt(a,b));
    }

    public static boolean Ou (boolean a, boolean b){
        return NonEt(Non(a),Non(b));
    }
}
