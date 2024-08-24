package org.aptech.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.aptech.collections.FindTarget.findTargetSum;

public class LinkedListDemo {
    public static void main(String[] args) {
//        linked list is an interface, can not be instantiated like array list
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(23);
        numbers.add(18);
        numbers.add(12);
        numbers.add(44);

        Collections.sort(numbers,Integer::compare);
//        System.out.println(numbers);
//       int max = findMax(numbers);
//        System.out.println(max);
//        System.out.println(addEvenOnly(numbers));

        List<Integer> prices = new ArrayList<>();
        prices.add(34);
        prices.add(7);
        prices.add(19);
        prices.add(48);
        prices.add(3);
//        System.out.println(addEvenOnly(prices));
    }
//    find maximum number
    public static int findMax(List<Integer> numbers){
//        numbers = new LinkedList<>();
//        Collections.sort(numbers, Integer::compareTo);
//        return numbers.get(numbers.size()-1);
        if (numbers.isEmpty()){
            throw new IllegalArgumentException("Please add numbers to the list");
        }
        return Collections.max(numbers);
    }

//    add even numbers
    public static int addEvenOnly(List<Integer> num){
        int sum = 0;
        for (int nums : num){
            if (nums % 2 == 0){
                sum+=nums;
            }
        }
        return sum;
    }



}
