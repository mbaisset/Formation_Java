public class elementsEnIndice {

    public static void main (String[] args) {
        int [] tab = {4,2,8,0,7,1};

        int [] tab2 = new int[tab.length / 2];

        for (int i = 0; i < tab.length; i = i + 2) {
            tab2 [tab[i + 1]] = tab [i];
        }
        for (int val : tab2 ) {
            System.out.print(val + " ");
        }
    }
}
