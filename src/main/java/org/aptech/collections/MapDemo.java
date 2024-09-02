package org.aptech.collections;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> fruits = new HashMap<>();
//        HashMap is the most used
        fruits.put("Mango", 3);
        fruits.put("Banana", 10);
        fruits.put("Apple", 12);
        fruits.put("Lemon", 5);
//        fruits.put("Banana", 15);
//        over-rides the previous one, order of
//        for (Map.Entry<String, Integer> fruit : fruits.entrySet()){
//            if (fruit.getValue()>=10) {
//                System.out.print(fruit.getKey() + ":");
//                System.out.println(fruit.getValue());
//            }
//        }
//        System.out.println(fruits);
//        REMOVE
//        fruits.remove("Mango");
//        System.out.println(fruits);

//        SIZE
        int size = fruits.size();
//        System.out.println("Size: "+ size);
//        System.out.println(fruits.get("Banana"));

//        check if key exists
//       String key = "Apple";
//       if (fruits.containsKey(key)){
//           System.out.println(key+ " found");
//       }else {
//           System.out.println("No such key as "+key);
//       }

//       fruits.putIfAbsent("WaterMelon", 27);
//        System.out.println(fruits);
//
//        Map<String, String> cars = new LinkedHashMap<>();
//        cars.put("Benz", "Gold");
//        cars.put("Toyota", "White");
//        cars.put("Honda", "Black");
//        cars.put("Tesla", "Gray");
//
//        System.out.println(cars);
////        order of insertion is guaranteed but it is not synchronized
//        for (Map.Entry<String, String> car : cars.entrySet()){
//            if (car.getKey().equalsIgnoreCase("toyota")){
//                cars.put("Toyota", "Green");
//            }
//            System.out.print(car.getKey()+":");
//            System.out.println(car.getValue());
//        }

//
//        Map<String, String> cars = new TreeMap<>();
//        cars.put("Benz", "Gold");
//        cars.put("Toyota", "White");
//        cars.put("Honda", "Black");
//        cars.put("Tesla", "Gray");
//
//        System.out.println(cars);
////        order of insertion is not guaranteed but it is synchronized
//        for (Map.Entry<String, String> car : cars.entrySet()){
//            if (car.getKey().equalsIgnoreCase("toyota")){
//                cars.put("Toyota", "Green");
//            }
//            System.out.print(car.getKey()+":");
//            System.out.println(car.getValue());
//        }


//        Map<String, String> cars = new Hashtable<>();
//        cars.put("Benz", "Gold");
//        cars.put("Toyota", "White");
//        cars.put("Honda", "Black");
//        cars.put("Tesla", "Gray");
//        cars.put("null", "check");

//        System.out.println(cars);
//        order of insertion is guaranteed
//        for (Map.Entry<String, String> car : cars.entrySet()){
//            if (car.getKey().equalsIgnoreCase("toyota")){
//                cars.put("Toyota", "Green");
//            }
//            System.out.print(car.getKey()+":");
//            System.out.println(car.getValue());
//        }

        int[] numbers = {23, 78, 13, 19, 45, 67};
        List<int[]> list = Arrays.asList(numbers);
        for (int[] lt : list)
            System.out.println(Arrays.toString(lt));
    }
}
