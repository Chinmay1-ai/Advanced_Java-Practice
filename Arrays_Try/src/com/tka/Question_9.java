   package com.tka;

public class Question_9 {

    public static void main(String[] args) {

        String input = "nayan";
        String res = "";  

       
        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);
            boolean isDup = false;

            for (int j = 0; j < res.length(); j++) {

                if (currentChar == res.charAt(j)) {
                    isDup = true;
                    break;
                }
            }

            if (!isDup) {
                res = res + currentChar;
            }
        }

        System.out.println("Original String : " + input);
        System.out.println("After Removing Duplicates : " + res);
    }
}
