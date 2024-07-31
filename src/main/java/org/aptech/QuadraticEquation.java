package org.aptech;

public class QuadraticEquation {

    public static double findD (double a, double b, double c){
        double x = a * c;
        double d = (Math.pow(b, 2) - (4 * x));
        return d;
    }

    public static void solveEquation (double a, double b, double c, double d){
        double x1, x2;

        if(d == 0){
            System.out.println("Roots of Quadratic Equation: ");
            x1 = -b/ (2 * a);
            System.out.println("X1 = "+ x1 + "\nX2 = "+ x1);

        } else if (d < 0) {
            System.out.println("Roots of Quadratic Equation: ");
            x1 = (-b + Math.sqrt(Math.abs(d))) / (2 * a);
            x2 = (-b - Math.sqrt(Math.abs(d))) / (2 * a);
            System.out.println("X1 = "+ x1 + "\nX2 = "+ x2);
        } else if (d > 0) {
            System.out.println("Roots of Quadratic Equation: ");
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("X1 = "+ x1 + "\nX2 = "+ x2);
        }

    }

}
