package org.aptech.exceptionDemo;

public class Maths {
    public static void main(String[] args) {
        division(45, 0);
        System.out.println("King and Prince are Elements of the Palace");

        try {
            checkElement();
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }

    public static void division(int numerator, int denominator){
        try{
            System.out.println((numerator/denominator));
        }
        catch (ArithmeticException e){
            System.out.println("You cannot divide by zero");
        }
//        catch (Exception e){
//            System.out.println("You cannot divide by zero");
//        }

    }

    public void getName(String name){
        try {
            System.out.println(name.length());
        }
//        catch (NullPointerException e){
//            System.out.println("Please input your name");
//        }
        catch (ArithmeticException | NullPointerException e){
            System.out.println("Please input a valid name");
        }
        finally {
            System.out.println("A Default name could be Sesame");
        }
    }

    public static void getElement(){
       try {
           int[] numbers = new int[2];
           System.out.println();
       }catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
           System.out.println("Element is out of bounds");
       }
    }

    public static void checkElement() throws CustomException {
        int[] numbers = new int[3];
        numbers[0] = 89;
        numbers[1] = 45;
        numbers[2] = 56;

        if (true){
            throw new CustomException("Something went wrong");
    }else {
            System.out.println("Nothing Happens");
        }
    }
}
