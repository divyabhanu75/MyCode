package com.company;

import java.util.Scanner;

public class FindVowelArray {

    public static void main(String[] args) {

        //Program to find whether a character is vowel or consonant
        //Step 1: use scanner and retrieve input charcter
        //Step 2: use a boolen expression in a condition to check whether inpu character is vowel
        //step 3: If vowel print its a vowel else print its a consonat
        int count = 0;
        char[] vowels = {'a','e','i','o','u','A','E','I','O','U'};
        boolean isVowel = false;

        while (count < 5) {
            //main Logic
            System.out.println("please enter a alphabet");
            Scanner scan = new Scanner(System.in);
            char inputChar = scan.next().charAt(0);

            for(int i = 0; i < vowels.length ; i++){
                System.out.println("Checking " + vowels[i] + "is Equal to " + inputChar);
                if(vowels[i] == inputChar){
                    System.out.println("Inside If condtion - Matched");
                    isVowel = true;
                    break;
                }
            }

            if(isVowel){
                System.out.println("Its a vowel");
            }
            else {
                System.out.println("Its a consonant");
            }

            count++;
        }
        System.out.println("End of the Program");
    }
}
