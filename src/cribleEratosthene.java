public class cribleEratosthene {

   public static void main (String [] args ) {
       boolean [] supprimes = new boolean[100];

       //initialisation du tableau
       //1 est conservé à true car pas nombre premier
       //for (int i = 1; i < 100; ++i) {
       //    supprimes [i] = false;
       //}

       supprimes [0] = true;
       //parcours du tableau pour trouver les nombres premiers
       for (int i = 1; i < 100; ++i) {
           if (supprimes [i] == false) {
               System.out.println("supprimes[" + i + "]");
               for (int j = 2; (((i + 1) * j) <= 100); ++j ) {
                   System.out.println(((i + 1) * j) - 1);
                   supprimes [((i + 1) * j) - 1] = true;
               }
           }
       }

       //Affichage des nombres premiers
       for (int i = 0; i < 100; ++i) {
           if (supprimes[i] == false) {
               System.out.print((i + 1) + " ");
           }
       }
   }
}
