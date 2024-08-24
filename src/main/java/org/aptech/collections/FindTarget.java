package org.aptech.collections;

import java.util.List;

public class FindTarget {
//    write a java program tha will return the index of two numbers that when added will be equal to the target
//    eg {4, 7, 10} 17=target return 1 & 2
    public static int findTargetSum(List<Integer> number, int target){
        int sum = 0;
        for(int i = 0; i< number.size(); i++){
            if(number.get(i) + number.get(i) == target){
                 sum = number.get(number.indexOf(i));
            }
            else{
                System.out.println("No Numbers added is equal to the Target ");
            }
        }
        return sum;
    }

//    write a java program that will return the product of the numbers that is greater than the target
//    eg {4,7,6} 5=target return 7*6
}

// write a program that gives a discount of 5% if the price of the product exceed a given target
// eg {5000, 1,000,000}, 100,000 = target