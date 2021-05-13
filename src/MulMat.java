import java.util.Scanner;

public class MulMat {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int nlignesMat1 = 0;
        int ncolonnesMat1 = 0;
        int nlignesMat2 = 0;
        int ncolonnesMat2 = 0;

        //Définition par l'utilisateur de la première matrice
        System.out.println("Indiquer le nombre de lignes de la Matrice 1 :");
        nlignesMat1 = scanner.nextInt();
        System.out.println("Indiquer le nombre de colonnes de la Matrice 1 :");
        ncolonnesMat1 = scanner.nextInt();

        //Déclaration de la matrices mat1 et initialisation de celle ci
        double [][] mat1 = new double[nlignesMat1][ncolonnesMat1];

        for(int i = 0; i < nlignesMat1; ++i) {
            for (int j = 0; j < ncolonnesMat1; ++j) {
                System.out.println("Veuillez entrer la valeur M[" + (i + 1) + "," + (j + 1) +"] de la Matrice 1 :");
                mat1[i][j] = scanner.nextDouble();
            }
        }

        //Définition par l'utilisateur de la seconde matrice
        System.out.println("Indiquer le nombre de lignes de la Matrice 2 :");
        nlignesMat2 = scanner.nextInt();
        System.out.println("Indiquer le nombre de colonnes de la Matrice 2 :");
        ncolonnesMat2 = scanner.nextInt();



        //Déclaration de la matrices mat2 et initialisation de celle ci
        double [][] mat2 = new double[nlignesMat2][ncolonnesMat2];

        for(int i = 0; i < nlignesMat2; ++i) {
            for (int j = 0; j < ncolonnesMat2; ++j) {
                System.out.println("Veuillez entrer la valeur M[" + (i + 1) + "," + (j + 1) +"] de la Matrice 2 :");
                mat2[i][j] = scanner.nextDouble();
            }
        }

        //Verification que le nombre de colonnes de Mat1 est égale au nombre de lignes de Mat2
        // Si égale => calcul de la multiplication des 2 matrices
        // si pas égale => Rejet avec calcul impossible
        if (nlignesMat2 == ncolonnesMat1) {
            for (int i = 0; i < nlignesMat1; ++i) {
                for (int j = 0; j < ncolonnesMat2; ++j) {
                    double produit = 0.0;
                    for (int k = 0; k < ncolonnesMat1; ++k) {
                        produit = produit + (mat1[i][k] * mat2[k][j]);
                    }
                    System.out.print(produit + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Multiplication de matrices impossible");
        }

    }
}
