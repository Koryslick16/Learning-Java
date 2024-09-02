package org.aptech.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentOutput {
    public static void main(String[] args){
        Map<Integer, Students> student = new HashMap<>();
        student.put(1, new Students(101, "Daniel Ime", 3.5));
        student.put(2, new Students(102, "King Jacob", 3.0));
        student.put(3, new Students(103, "Korede Komolafe", 2.9));
        student.put(4, new Students(104, "Peter Obi", 2.5));

//        hashTable: descending order
//        hashMap order is guaranteed, still check sha

//        for (Map.Entry<Integer, Students> newStudent : student.entrySet()){
//            System.out.println(newStudent.toString());
//        }
//        Students students1 = student.get(3);
//        System.out.println(students1.toString());

        Set<Integer> key = student.keySet();
//        System.out.println(key);
        for (int ky : key){
            System.out.println(student.get(ky));
        }

//        set: duplicate is removed, action or data must be only one
    }
}
