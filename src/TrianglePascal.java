import java.util.Scanner;

public class TrianglePascal {
    private static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {
        int n = 0;

        do {
            System.out.println("Veuillez entrer le nombre entier n > 0 :");
            n = scanner.nextInt();

            if (n < 1) {
                System.out.println("L'entier doit être suprérieur à O");
            }
        } while (n < 1);

        int[][] trianglePascal = new int[n][];

        //trianglePascal [0] = new int[1];
        //trianglePascal [0][0] = 1;
        //System.out.println(trianglePascal[0][0]);
        for (int i = 0; i < n; ++i) {
            trianglePascal [i] = new int [i + 1];
            //System.out.println("length :" + trianglePascal[i].length);
            for (int j = 0; j < (i + 1); ++j) {
                if (((j - 1) < 0) || (j == i)) {
                    //System.out.println("i :" + i);
                    //System.out.println("j : " + j);
                    trianglePascal [i][j] = 1;
                    //System.out.println("trianglePascal [" + i + "][" + j +"] " + trianglePascal [i][j]);
                }
                else {
                    trianglePascal [i][j] = trianglePascal[i-1][j] + trianglePascal[i-1][j-1];
                    //System.out.println("i :" + i);
                    //System.out.println("j : " + j);
                    //System.out.println("trianglePascal[i-1][j] : " + trianglePascal[i-1][j]);
                    //System.out.println("trianglePascal[i-1][j-1] : " + trianglePascal[i-1][j-1]);
                }
                System.out.print(trianglePascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}
