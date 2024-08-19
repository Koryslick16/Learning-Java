package org.aptech.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(24);
        numbers.add(45);
        numbers.add(75);
//  adding elements to the arrayList

//        for (int i = 0; i<numbers.size(); i++){
//            System.out.println(numbers.get(i));
//        }
//  print individual elements in the arraylist

//        Iterator<Integer> number = numbers.iterator();
//        while(number.hasNext()){
//            System.out.println(number.next());
//        }
//  second method to loop through the arrayList to get individual elements
//  interator is an inbuilt method that comes with th collection package

//        for (int  num : numbers){
//            System.out.println("Enhanced Loop "+num);
//        }

//        numbers.stream().forEach(
//                System.out::println
//        );

//  another method using the stream method with a forEach loop

//        if (numbers.contains(24)) {
//            numbers.set(1, 67);
//            System.out.println("Yes, ");
//        }
//        else {
//            System.out.println("Nope");
//        }
//        numbers.stream().forEach(System.out::println);

//        boolean remove = numbers.remove(numbers.get(3));
//        if(remove){
//            System.out.println("Items deleted successfully");
//        }else{
//            System.out.println("Something went wrong");
//        }

//        numbers.stream().forEach(System.out::println);


        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Beans");
        fruits.add("Pineapple");
        fruits.add("Banana");
        fruits.add("Pineapple");

        fruits.removeIf(fruit->fruit.startsWith("O"));
        System.out.println(fruits);

      int banana =  fruits.indexOf("Banana");
        System.out.println(banana);
        int pine =fruits.lastIndexOf("Pineapple");
        System.out.println(pine);

        int size = fruits.size();
        System.out.println(fruits.get(size-1));
    }
}
//collection deals with size

// ADD favourite food
// Update food
// Search for a food
// Display all the food
// Delete a food
// Exit

