package org.aptech;

public class Computation {
     public static final double PIE = 3.14;
     // final cannot be changed, like const, static shows u might not need to instatiate for a class in the main java
    public int addTwo(int a, int b){
        return a + b;
    }

    public void Greeting(String name){
        System.out.println("Hello " + name);
    }

    public int findForce(int m, int a){
        return m * a;
    }

    public int findT (int u, int v){
        int t = u + v;
        return t;
    }

    public int AVALUE = 6;

    public int findC (){
         int c = AVALUE + findT(2, 3);
        return c;
    }

    public int findK (int b){
//         int t = u + v;
//         int c = a + t;
//        int findC;
       int K = ((3 * b) + findC()) / 2;
//         return (3*b + c) / 2;
        return K;
    }

//    double divideTwo(int a, int b){
//        if(b>0)
//        return a/b;
//    }
//}

     public void divideTwo (int a, int b){
         if(b != 0){
             System.out.println(a/b);
         }else{
             System.out.println("Division by zero is not allowed");
         }
    }

    public double findAreaOfCircle (double r){
        return PIE * Math.pow(r,2);
    }


    public void gravitationalForce (double m1, double m2, double r){
        if( r != 0) {
            System.out.println("G= " + Math.round((m1 * m2) / Math.pow(r, 2)) + "ms/2");
        }else{
            System.out.println("R should not be zero");
        }
    }

}
