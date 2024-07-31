package org.aptech;

import java.util.Arrays;

public class StringDemo {

    public static void main(String[] args) {
        String message = "I love Spiderman series.";
//        System.out.println("You know "+ message.length());
//        message = message.toUpperCase();
//        System.out.println(message);

//        System.out.println(message.contains("love"));
//        StringDemo.removeDuplicates("Mikeeee");
//        System.out.println(removeDuplicates("Ssammy"));
//        System.out.println(reverseStr("LovemE"));
//        System.out.println(palindrome("miluv"));
//        System.out.println(palindrome("radar"));
        System.out.println(isPalindrome("adarr"));
//        String str = "hello";
//        int[] vc = countLetter(str);
//        System.out.println("Vowels Count: " + vc[0] + "\nConsonant Count: " + vc[1]);
//        System.out.println(anagram("emit", "mine"));
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter Password");
//        String password = input.next();
//        System.out.println(register(password));
    }

//    Scanner input = new Scanner(System.in);

    public static String register(String password){
        if(password.length() < 5){
            return "Password Length must be less than 5 characters";
        }
        return "Login successful";
    }

    //remove duplicate from string mikeee => mike

    public static String removeDuplicates(String str){
        str = str.toLowerCase();
        String result = "";
//        char result = ' ';
        for (int i = 0; i< str.length(); i++){
            if (result.indexOf(str.charAt(i)) == -1){
//                result.append.str.charAt(i);
                result += str.charAt(i);
            }
        }
        return result;
    }


    public static String reverseStr (String str){
        StringBuilder reverseStr = new StringBuilder();
        if (str.length() == 1)
            return str;

        for (int i = str.length()-1; i >=0; i--){
            char character = str.charAt(i);
            reverseStr.append(character);
        }
        return reverseStr.toString();
//        return reverseStr.toString().equalstoIgnoreCase(str);
    }

    public static boolean palindrome (String str){
        StringBuilder reverseStr = new StringBuilder();
        if (str.length() == 1)
            return true;

        for (int i = str.length()-1; i >=0; i--){
            char character = str.charAt(i);
            reverseStr.append(character);
        }
        return reverseStr.toString().equalsIgnoreCase(str);
    }

    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while (left < right){
            if (str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
            return false;
        }
        return true;
    }

    // viwel and consonant count
    public static int[] countLetter (String str){
        int vCount = 0;
        int cCount = 0;
        String vowels = "aeiouAEIOU";
        char[] charArray = vowels.toCharArray();
//        for (char character : str.toCharArray()){
//            if (charArray.equals(character)) {
//                vCount++;
//            }
//            else {
//                cCount++;
//            }
//        }
        for(int i= 0; i<str.length(); i++){
            if (vowels.indexOf(str.charAt(i)) != -1){
                vCount++;
            }
            cCount++;
        }
        return new int[] {vCount, cCount};
    }

    public static boolean anagram(String str1, String str2){
        if (str1.equalsIgnoreCase(str2)){
            return false;
        }
        char[] strArray = str1.toCharArray();
        char[] strArray2 = str2.toCharArray();

        Arrays.sort(strArray);
        Arrays.sort(strArray2);
         int length = strArray.length;
        for (int i = 0; i< length; i++){
//            for (int  j= 0; j< length; i++){
//            }
            if (strArray[i] != strArray2[i]){
                return false;
            }
        }
        return true;

    }

}
