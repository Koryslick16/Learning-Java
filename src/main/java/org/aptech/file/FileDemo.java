package org.aptech.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;

public class FileDemo {
    public static void main(String[] args) {
// write into file
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            writer.write("Igwe-Daniel Male 19 IT");
            writer.write("\nJacob-Inala Female 18 Support");
            writer.write("\nAdebayo-Micheal Male 22 Engineer");
        }catch (Exception e){
            e.printStackTrace();
        }

//        read from file
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
//            String read = reader.readLine();
//            System.out.println(read);

            String line;
            while ((line = reader.readLine()) != null){
                String[] split = line.split(" ");
                String name = split[0].replace("-", " ");
                String gender = split[1];
                String age = split[2];
                String rank = split[3];
                System.out.println("Full name: "+name+"\nGender: "+gender+"\nAge: "+age+"\nRank: "+rank);
                System.out.println("-------------------------------------------");
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
