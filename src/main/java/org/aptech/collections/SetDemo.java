package org.aptech.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
    Set<String> users = new HashSet<>();
    users.add("Mike");
    users.add("Daniel");
    users.add("King");
    users.add("Prince");

//    users.forEach(System.out::println);
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(4);

        System.out.println(removeDuplicate(nums));

   }
    public static Set<Integer> removeDuplicate (List<Integer> numbers){
//        numbers = new ArrayList<>();

        Set<Integer> uniqueNo =new HashSet<>();
        uniqueNo.addAll(numbers);
        return uniqueNo;
    }
}
