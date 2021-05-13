import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
                {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
                {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
                {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
                {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
                {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
        int nbcote = 0;
        ArrayList<Integer> ligne = new ArrayList<Integer>();
        ArrayList<Integer> colonne = new ArrayList<Integer>();
        ArrayList<Integer> valeurBordure = new ArrayList<Integer>();
        int component = 1;

        //Vérification de l'intégrité de la carte
        for (int i = 0; i < carte.length; ++i) {
            for (int j = 0; j < carte[i].length; ++j) {
                if ((carte[i][j] != 0) && (carte[i][j] != 1)) {
                    System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
                    System.out.print(carte[i][j]);
                    System.out.print("' trouvée en position [");
                    System.out.print(i);
                    System.out.print("][");
                    System.out.print(j);
                    System.out.println("]");
                    return;
                }
            }
        }

        //Vérification de la convexité des lignes
        for (int i = 0; i < carte.length; ++i) {
            for (int j = 0; j < carte[i].length; ++j) {
                if (carte[i][j] == 0) {
                    ++component;
                    ligne.add(i);
                    colonne.add(j);
                    while (!ligne.isEmpty() && !colonne.isEmpty()) {
                        int l = ligne.get(0);
                        int c = colonne.get(0);
                        ligne.remove(0);
                        colonne.remove(0);
                        if (carte[l][c] == 0) {
                            carte[l][c] = component;


                            if (((l - 1) > 0) && (carte[l - 1][c] == 0)) {
                                ligne.add(l - 1);
                                colonne.add(c);
                            }

                            if (((l + 1) < carte.length) && (carte[l + 1][c] == 0)) {
                                ligne.add(l + 1);
                                colonne.add(c);
                            }

                            if (((c - 1) > 0) && (carte[l][c - 1] == 0)) {
                                ligne.add(l);
                                colonne.add(c - 1);
                            }

                            if (((c + 1) < carte[l].length) && (carte[l][c + 1] == 0)) {
                                ligne.add(l);
                                colonne.add(c + 1);
                            }
                        }
                    }
                }
            }
        }

        //Initialisation des valeurs en bord de carte
        for (int i= 0; i < carte[0].length; ++i) {
            if (carte[0][i] != 1) {
                valeurBordure.add(carte[0][i]);
            }
        }

        for (int i = 0; i < carte[carte.length - 1].length; ++i) {
            if (carte[carte.length - 1][i] != 1) {
                valeurBordure.add(carte[carte.length - 1][i]);
            }
        }

        for (int i = 0; i < carte.length; ++i) {
            if (carte[i][0] != 1) {
                valeurBordure.add(carte[i][0]);
            }
        }

        for (int i = 0; i < carte.length; ++i) {
            if (carte[i][carte[i].length - 1] != 1) {
                valeurBordure.add(carte[i][carte[i].length - 1]);
            }
        }

//        for (int i = 0; i < carte.length; ++i) {
//            for (int j = 0; j < carte[i].length; ++j) {
//                System.out.print(carte[i][j]);
//            }
//            System.out.println();
//        }

        //Remplissage des étangs
        for (int i = 0; i < carte.length; ++i) {
            int firstOne = -1;
            int lastOne = carte[i].length;

            do {
                firstOne = firstOne + 1;
            } while ((carte[i][firstOne] != 1) && (firstOne < carte[i].length - 1));
            do {
                lastOne = lastOne - 1;
            } while ((carte[i][lastOne] != 1) & (lastOne > 1));



            for (int k = firstOne; k < lastOne; ++k) {
            //    if (carte[i][k] == 0) {
                if (carte[i][k] != 1) {
                    if (!valeurBordure.contains(carte[i][k])) {
                        carte[i][k] = 1;
                    } else {
                        System.out.println("Votre carte du terrain n'a pas le bon format :");
                        System.out.print("bord extérieur entrant trouvé en position [");
                        System.out.print(i);
                        System.out.print("][");
                        System.out.print(k);
                        System.out.println("]");
                        return;
                    }
                }
            }
        }

        for (int i = 0; i < carte.length; ++i) {
            for (int j= 0; j < carte[i].length; ++ j) {
                if (carte[i][j] == 1) {
                    if (j == 0) {
                        ++nbcote;
                    } else if(carte[i][j-1] != 1) {
                        ++nbcote;
                    }

                    if (i == 0) {
                        ++nbcote;
                    } else if (carte [i-1][j] != 1) {
                        ++nbcote;
                    }

                    if (j == carte[i].length - 1) {
                        ++nbcote;
                    } else if (carte[i][j+1] != 1) {
                        ++nbcote;
                    }

                    if (i == carte.length - 1) {
                        ++nbcote;
                    } else if (carte[i+1][j] != 1) {
                        ++nbcote;
                    }

                }

            }
        }




        //System.out.println("Votre carte du terrain n'a pas le bon format :");
        //System.out.print("bord extérieur entrant trouvé en position [");
        //System.out.print("][");
        //System.out.println("]");

        System.out.print("Il vous faut ");
        System.out.print(nbcote * 2.5);
        System.out.println(" mètres de clôture pour votre terrain.");

        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}
