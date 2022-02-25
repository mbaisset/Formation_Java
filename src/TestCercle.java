import java.math.*;

public class TestCercle {
    public static void main(String[] args){

        Cercle c1 = new Cercle();
        Cercle c2 = new Cercle();
        Cercle c3 = new Cercle();

        c1.setRayon(2);
        c1.setCentre(0,0);
        System.out.println(c1.estInterieur(1.1, 1));
        System.out.println(c1.estInterieur(2, 2));
        System.out.println(c1.estInterieur(1, 2.01));
        System.out.println(c1.estInterieur(2.01, 0));

    }

    static class Cercle {
        //Attributes
        private double rayon;
        private double x;
        private double y;

        //Getters and Setters
        public void setRayon(double rayon) {
            this.rayon = rayon;
        }

        public void setCentre (double x, double y){
            this.x = x;
            this.y = y;
        }

        //Methods
        public double surface(){
            return Math.sqrt(this.rayon) * Math.PI;
        }

        public boolean estInterieur (double x, double y){
            return (Math.abs(this.x - x) <= rayon) && (Math.abs(this.y - y) <= rayon);
        }
    }
}
