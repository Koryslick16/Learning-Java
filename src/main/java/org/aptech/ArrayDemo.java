package org.aptech;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    Scanner scanner = new Scanner(System.in);
    public static final String QS1 = "How many meals do u fancy?";

    public static int sumArray(int[] numbers){
        int sum = 0;
        for(int num : numbers){
            sum += num;
        }
        return sum;
    }

    public static int sumArray2 (int[] numbers){
        return Arrays.stream(numbers).sum();
    }

    // sum only if sumEven
    public static int sumEven(int[] numbers){
        int sum = 0;
        for(int i=0; i < numbers.length; i++){
            int number = numbers[i];
            if(number % 2 == 0){
                sum += number;
            }
        }
        return sum;
    }
    public static int sum10(int[] nums){
        int Sum = 0;
        for(int num : nums){
            if(num > 10){
                Sum += num;
            }
        }
        return Sum;
    }

    // 40, 23, 12, 190 => 12

    public static int minValue(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static int maxValue(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static String arrItems(int[] numbers){
        Arrays.sort(numbers);
        return Arrays.toString(numbers);
//       return result.getClass();
    }

    public int mealNo (){
        scanner = new Scanner(System.in);
        System.out.println(QS1);
        return scanner.nextInt();
    }
    public String[] FavMeal(int mealNo){
        Scanner scanner = new Scanner(System.in);
        String[] favMeals = new String[mealNo];
        for(int i = 0; i< favMeals.length; i++){
            System.out.println((i + 1) + " Fav");

            favMeals[i] = scanner.nextLine();
        }
        return favMeals;
    }
    public void displayMeal (String[] favMeals){
        System.out.println("******************************** FAV MEALS ********************************");

        for (String Meal : favMeals){
            System.out.println(Meal);
        }
    }

    // reverse array
    public static String reverseArray (int[] numbers) {
        int[] newArray = new int[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            newArray[i] = numbers[numbers.length-1-i];
        }
        return Arrays.toString(newArray);
        }

        // 2-dimensional Array

    }
//}
