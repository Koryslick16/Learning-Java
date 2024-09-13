package org.aptech.recursion;

public class RecursionDemo {
        public static void main(String[] args) {

            System.out.println(RecursionDemo.factorial(5));
//            System.out.println(RecursionDemo.bunnyears(4));
            System.out.println(RecursionDemo.triangle(4));
        }
//        2! = 2 * 1
//        1! = 1 * 1
//        3! = 3 * 2 * 1
//        8! -> 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1
        public static int factorial(int n){
            if (n <= 2) {
                return n;
            }
            return n * factorial(n-1);
        }


        public static int bunnyears(int numbers){
            if (numbers == 0){
                return 0;
            }
            return numbers * 2;
        }

        public static int triangle(int rows){
            if (rows <=1) return rows;

            return rows + triangle(rows-1);
        }
}
