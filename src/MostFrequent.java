class MostFrequent {

    public static void main(String[] args) {
         int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
         int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/

        int [][] mostFrequent = new int[taille][2];

        int mostFreq;
        int nbOccurences = 0;

        //initialisation du tableau mostFrequent
        mostFrequent[0][0] = tab1[0];
        mostFrequent[0][1] = 1;
        int nbElementMostFreq = 0;

        for (int i = 1; i < taille; ++i) {
            boolean isPresent = false;
            for (int j = 0; j < nbElementMostFreq + 1; ++j) {
                if (tab1[i] == mostFrequent [j][0]) {
                    mostFrequent [j][1] = mostFrequent[j][1] + 1;
                    isPresent = true;
                }
            }
            if (isPresent == false) {
                nbElementMostFreq = nbElementMostFreq + 1;
                mostFrequent [nbElementMostFreq][0] = tab1 [i];
                mostFrequent [nbElementMostFreq] [1] = 1;
            }
        }

        mostFreq = mostFrequent [0][0];
        nbOccurences = mostFrequent [0][1];
        for (int i = 1; i < nbElementMostFreq; ++i) {
            if (nbOccurences < mostFrequent [i][1]) {
                nbOccurences = mostFrequent [i][1];
                mostFreq = mostFrequent [i][0];
            }
        }

        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.println(mostFreq + " (" + nbOccurences + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
