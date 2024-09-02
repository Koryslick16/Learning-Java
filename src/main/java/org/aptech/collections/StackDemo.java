package org.aptech.collections;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> history = new Stack<>();
        history.push("abc.com");
        history.push("dac.com");
        history.push("manU.com");
        history.push("chelsea.com");
        history.push("madrid.com");

//       String popItem = history.pop();
//        System.out.println(popItem);

//        String peekItem = history.peek();
//        System.out.println(peekItem);

//        Iterator<String> iterator = history.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        history.forEach(System.out::println);
//        for (String hist : history){
//            System.out.println(hist);
//        }
//        for (int i = 0; i<history.size(); i++){
//            System.out.println(history.get(i));
//        }
    }
}
