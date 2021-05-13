import java.util.Scanner;

public class MulMatMod {

    /* Notez que le Scanner à utiliser pour les lectures est déclaré ici
     * globalement pour ne pas être recréé à chaque appel de méthode
     * où il est utile.
     * Toute méthode du programme peut alors utiliser la variable scanner
     * sans la re-déclarer.
     * Il n'y a plus besoin d'avoir recours à scanner.close();
     */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double[][] mat1 = lireMatrice();
        double[][] mat2 = lireMatrice();

        if (mat1[0].length != mat2.length) {
            System.out.println("Multiplication de matrices impossible !");
        } else {
            double [][] prod = multiplierMatrice(mat1, mat2);
            System.out.println("Résultat :");
            afficherMatrice(prod);
        }
    }

    /**************************************************/
    //The aim of this method is to ask to the user the number of lines and columns of a matrix and to create it
    public static double[][] lireMatrice () {
        int nlignesMat = 0;
        int ncolonnesMat = 0;

        //Definition by the user of the number of lignes of the matrix
        System.out.println("Indiquer le nombre de lignes de la Matrice: ");
        nlignesMat = scanner.nextInt();

        //Definition by the user of the number of columns of the matrix
        System.out.println("Indiquer le nombre de colonnes de la Matrice: ");
        ncolonnesMat = scanner.nextInt();

        //Creation of the matrix by reading the numbers entered by the user
        //Definition of the matrix to be returned based on the number of lines and columns
        double [][] mat = new double[nlignesMat][ncolonnesMat];

        for(int i = 0; i < nlignesMat; ++i) {
            for (int j = 0; j < ncolonnesMat; ++j) {
                System.out.println("Veuillez entrer la valeur M[" + (i + 1) + "," + (j + 1) +"] de la Matrice 1 :");
                mat[i][j] = scanner.nextDouble();
            }
        }

        //Return the created matrix
        return mat;
    }


    /**************************************************************/
    //The aim of this method is to multiply two matrix if possible
    public static double[][] multiplierMatrice (double [][] matrice1, double [][] matrice2) {
        double [][] matriceProduit;
        matriceProduit = new double[matrice1.length][matrice1[0].length];

        for (int i = 0; i < matrice1.length; ++i) {
            for (int j = 0; j < matrice2[0].length; ++j) {
                double produit = 0.0;
                for (int k = 0; k < matrice1[0].length; ++k) {
                    produit = produit + (matrice1[i][k] * matrice2[k][j]);
                }
                matriceProduit[i][j] = produit;
            }
        }
        return matriceProduit;
    }

    /*********************************************************/
    //The aim of this method is to display a matrix
    public static void afficherMatrice (double[][] matrixToDisplay) {
        for (int i = 0; i < matrixToDisplay.length; i++) {
            for (int j=0; j < matrixToDisplay[i].length; j++) {
                System.out.print(matrixToDisplay[i][j] + " ");
            }
            System.out.println();
        }
    }
}
