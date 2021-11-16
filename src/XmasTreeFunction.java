public class XmasTreeFunction {

    public static void main (String[] args) {
        int nblignes = 6;

        XmasTree(nblignes);
        System.out.println();
        XmasTree2(nblignes);
        System.out.println();
        System.out.println();
        XmasTree3(nblignes);

    }

    public static void XmasTree3 (int nblines){
        for (int i = 3; i < nblines; i++){
            XmasTree(i, nblines-2,i-3,i);
        }
        espaces(nblines-3);
        System.out.println("|||");
    }

    public static void XmasTree2 (int nblines) {
        for (int i = 2; i <= nblines; i++){
            XmasTree(i, nblines - 1);
        }
        espaces(nblines-1);
        etoiles(1);

    }

    public static void XmasTree (int nblignes, int numberSpace, int startFrom, int stopAt){
        for (int i = startFrom; i < stopAt; i++){
            espaces(numberSpace - i);
            etoiles(2*i+1);
            System.out.println();
        }
    }

    public static void XmasTree (int nblignes, int numberSpace){
        for (int i = 0; i < nblignes; i++){
            espaces(numberSpace - i);
            etoiles(2*i+1);
            System.out.println();
        }
    }

    public static void XmasTree (int nblignes){
        for (int i = 0; i < nblignes; i++){
            espaces(nblignes-i-1);
            etoiles(2*i+1);
            System.out.println();
        }
    }

    public static void etoiles(int nbEtoiles){
        for(int i = 0; i < nbEtoiles; ++i) {
            System.out.print('*');
        }
    }

    public static void espaces(int nbEspaces){
        for(int i = 0; i < nbEspaces; ++i) {
            System.out.print(' ');
        }
    }
}
