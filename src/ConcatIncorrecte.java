public class ConcatIncorrecte {

    public static void main (String[] args) {
        String s1 = "China Blue";
        System.out.println(s1);
        s1 = concatener (s1, " Express");
        System.out.println(s1);
    }

    public static String concatener (String s, String s2) {
        s = s + s2;
        System.out.println(s);

        return s;

    }
}
