import java.util.ArrayList;

public class Premiers {

    public static void main (String[] args) {

        ArrayList<Integer> premier = new ArrayList<Integer>();

        premier.add(2);

        for (int i = 3; i <= 100; ++i) {
            if ((i % 2) != 0) {
                boolean isPremier = true;
                for (int j = 0; j < premier.size(); ++j) {
                    if ((premier.get(j) <= Math.sqrt(i)) &&((i % premier.get(j)) == 0)) {
                        isPremier = false;
                        break;
                    }
                }
                if (isPremier == true) {
                    premier.add(i);
                }
            }
        }

        for (int valeur : premier) {
            System.out.println(valeur);
        }
    }

}
