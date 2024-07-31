package org.aptech;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and Welcome!\n");

//        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        Computation comp = new Computation();
//        System.out.println("Sum= "+comp.addTwo(20, 10));
//        System.out.println("Sum= "+ comp.addTwo(23, 45));
        comp.Greeting("Korede");
//        System.out.println("Force= "+ comp.findForce(20, 10)+"N");
//        System.out.println("K= "+ comp.findK(10));
//        System.out.println("K= "+ comp.findK(4));

        var compute = new Computation();
//        System.out.println(compute.divideTwo(6, 2));
//        compute.divideTwo(-6, -3);
//        var input = new Scanner(System.in);
//        System.out.println("Please enter radius of circle: ");
//        double radius = input.nextDouble();
//        System.out.printf("Area Of Circle= %sm%n", compute.findAreaOfCircle(radius));

//        var input = new Scanner(System.in);
//
//        System.out.println("Input initial mass of object: ");
//        double mass1 = input.nextDouble();
//
//        System.out.println("Input final mass of object: ");
//        double mass2 = input.nextDouble();
//
//        System.out.println("Input the radius of object: ");
//        double radius = input.nextDouble();
//
//        compute.gravitationalForce(mass1, mass2, radius);

        // declare array
//        int[] numbers = new int[4];
//        String[] names = {"Daniel", "Peter", "Micheal", "Restorer"};
//        char[] gender = {'M', 'F'};
//        double[] decimals = new double[6];
//
//        numbers[0] = 23;
//        numbers[1] = 13;
//        numbers[2] = 62;
//        numbers[3] = 31;
//
//        for(int num : numbers){
//            System.out.println(num);
//        }

//        var arrayDemo = new ArrayDemo();
        ArrayDemo demo = new ArrayDemo();
//        int[] data = {1, 2, 4, 79, 8, 9, 23, -1};
//        System.out.println(ArrayDemo.sumArray(data));
//        System.out.println(ArrayDemo.sumArray2(data));
//        System.out.println(ArrayDemo.sumEven(data));
//        System.out.println(ArrayDemo.sum10(data));
//        System.out.println(ArrayDemo.minValue(data));
//        System.out.println(ArrayDemo.maxValue(data));
//        System.out.println(ArrayDemo.arrItems(data));

//        System.out.println("How many meals do u fancy? ");
//        int mealNo = scanner.nextInt();
//
//        String[] favMeal = new String[mealNo];
//
//        for(int i = 0; i < favMeal.length; i++){
//            System.out.println((i + 1) + " Fav");
//            favMeal[i] = scanner.next();
//        }
//        System.out.println("******************************** FAV MEALS ********************************");
//
//        for (String favourite : favMeal){
//            System.out.println(favourite);
//        }

//        int meal = demo.mealNo();
//       String[] favourite = demo.FavMeal(meal);
//        demo.displayMeal(favourite);


//        int[] values = {1, 2, 3, 4, 5, 6};
//        System.out.println(ArrayDemo.reverseArray(values));
        // 2-dimensional array
//        int[][] matrixA = new int[2][2];
//          matrixA[0][0] = 3;
//          matrixA[0][1] = 1;
//          matrixA[1][0] = 4;
//          matrixA[1][1] = 5;

//          for(int i = 0; i < matrixA.length; i++) {
//              for (int j = 0; j < matrixA[i].length; j++) {
//                  System.out.print(matrixA[i][j]+" ");
//              }
//              System.out.println(" ");
//          }

//          for(int[] row : matrixA){
//              for(int col : row){
//                  System.out.print(col+" ");
//              }
//              System.out.println();
//          }

//          for (int i=1; i<=5; i++){

//          }
        int[][] myArr = {
                {3, 1, 6},
                {2, 4, 10},
                {5, 12, 9}
        };

//        int[][] myArr = new int[3][3];
//        myArr[0][0] = 3;
//        myArr[0][1] = 1;
//        myArr[0][2] = 6;
//        myArr[1][0] = 2;
//        myArr[1][1] = 4;
//        myArr[1][2] = 10;
//        myArr[2][0] = 5;
//        myArr[2][1] = 12;
//        myArr[2][2] = 9;

        int[][] secondArr = {
                {8, 7, 6},
                {13, 20, 9},
                {11, 7, 5}
        };

//        int[][] secondArr = new int[3][3];
//        secondArr[0][0] = 8;
//        secondArr[0][1] = 7;
//        secondArr[0][2] = 6;
//        secondArr[1][0] = 13;
//        secondArr[1][1] = 20;
//        secondArr[1][2] = 9;
//        secondArr[2][0] = 11;
//        secondArr[2][1] = 7;
//        secondArr[2][2] = 5;

        for(int i = 0; i < myArr.length; i++) {
              for (int j = 0; j < myArr[i].length; j++) {
                  System.out.print(myArr[i][j]+" ");
              }
              System.out.println("");
          }
        System.out.println();

        for(int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < secondArr[i].length; j++) {
                System.out.print(secondArr[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println();

        int[][] newArray = new int[3][3];

        for(int i= 0; i < newArray.length; i++){
            for(int j=0; j < newArray[i].length; j++){
                newArray[i][j] = myArr[i][j] + secondArr[i][j];
            }
        }
        for (int i = 0; i< newArray.length; i++){
            for(int j = 0; j< newArray[i].length; j++){
                System.out.print(newArray[i][j]+" ");
            }
            System.out.println("");
        }

        QuadraticEquation equation = new QuadraticEquation();
        System.out.println("Enter a, b, and c respectively: ");
        double a, b, c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

       double d = equation.findD(a, b, c);
//        System.out.println("D ="+ d);
       equation.solveEquation(a, b, c, d);



    }
}

// COMPUTE STUDENTS GRADE
// Prince Jacob {
//Physics: 69
//Maths: 80
//Chemistry: 90
// }
//         *
//      *      *
//     *    *    *
//    *   *   *   *
//Checkers board game
// tic tac toe
