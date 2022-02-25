import java.util.Scanner;

public class Geometrie {
    static Scanner keyboard = new Scanner(System.in);

    public static void main (String[] args){
        Triangle triangle = new Triangle();
        System.out.println(triangle.getDistancePoint1Point2());
        System.out.println("Périmètre: " + triangle.calculPerimetre());
        System.out.println("Distance 1 " + triangle.getDistancePoint1Point2());
        System.out.println("Distance 2 " + triangle.getDistancePoint1Point3());
        System.out.println("Distance 3 " + triangle.getDistancePoint2Point3());
        triangle.isIsocele();

    }

    static class Triangle {
        //Attributes
        private Point point1;
        private Point point2;
        private Point point3;
        private double distancePoint1Point2;
        private double distancePoint1Point3;
        private double distancePoint2Point3;

        //Constructors
        private Triangle (){
            System.out.println("Construction d'un nouveau point");
            point1 = new Point();
            point1.setX();
            point1.setY();

            System.out.println("Construction d'un nouveau point");
            point2 = new Point();
            point2.setX();
            point2.setY();

            System.out.println("Construction d'un nouveau point");
            point3 = new Point();
            point3.setX();
            point3.setY();

            this.distancePoint1Point2 = this.calculDistance(this.point1, this.point2);
            this.distancePoint1Point3 = this.calculDistance(this.point1, this.point3);
            this.distancePoint2Point3 = this.calculDistance(this.point2, this.point3);
        }

        //Getters and Setters
        public double getDistancePoint1Point2 (){
            return this.distancePoint1Point2;
        }

        public double getDistancePoint1Point3 (){
            return this.distancePoint1Point3;
        }

        public double getDistancePoint2Point3 (){
            return this.distancePoint2Point3;
        }

        //Methods
        private double calculDistance (Point point1, Point point2){
            return Math.sqrt(Math.pow((point1.x-point2.x), 2) + Math.pow(point1.y - point2.y, 2));
        }

        private double calculPerimetre (){
            return this.distancePoint1Point2 + this.distancePoint1Point3 + this.distancePoint2Point3;
        }

        private void isIsocele (){
            if ((distancePoint1Point2 == distancePoint1Point3) || (distancePoint1Point3 == distancePoint2Point3) || (distancePoint2Point3 == distancePoint1Point2)){
                System.out.println("Le triangle est isocéle");
            } else {
                System.out.println("Le triangle n'est pas isocéle");
            }
        }

    }

    static class Point {
        //Attributes
        double x;
        double y;

        //Getters and Setters
        public void setX(){
            System.out.println("Veuillez entrer x : ");
            this.x = keyboard.nextDouble();
        }

        public void setY(){
            System.out.println("Veuillez entrer y : ");
            this.y = keyboard.nextDouble();
        }
    }
}
